SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python311-vsts-0.1.25-2.14.noarch.rpm"
RPM_HASH = "908eea2d27516f159c430f1b7842abbc376e06767be20d5d90a2dcbecaae2957c278978d19dc6b33ee0ce8724e899999e5aa35ae46df1fd19e207d9f74021ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vsts) \
python311-vsts \
python3dist(vsts)"

RDEPENDS:${PN} += "python(abi) \
python311-msrest"

inherit rpm
