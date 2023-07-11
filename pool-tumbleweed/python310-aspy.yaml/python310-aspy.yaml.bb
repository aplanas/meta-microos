SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-aspy.yaml-1.3.0-2.10.noarch.rpm"
RPM_HASH = "b18d4cd82312e5e2448fc5b2474a423e4af79311551336f4241187bd70f5c8086147f3ead2b7b98892f2519f79bea484a7ee932495b0bd6df3f0e2b4613e2723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aspy.yaml \
python310-aspy.yaml \
python3dist-aspy.yaml"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
