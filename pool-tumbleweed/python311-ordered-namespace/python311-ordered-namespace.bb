SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python311-ordered-namespace-2019.6.8-1.19.noarch.rpm"
RPM_HASH = "c741ed0fca94d340787baaea46dce2fadd02ca0c2008741460492803d6e6c5ce72b1e5a8a74c6b6f4fc2f509c1ee567442f9fe51140185e7483f0a091f1a9826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ordered-namespace) \
python311-ordered-namespace \
python3dist(ordered-namespace)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
