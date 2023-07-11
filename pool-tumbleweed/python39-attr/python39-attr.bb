SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-attr-0.3.2-1.5.noarch.rpm"
RPM_HASH = "65f7e95405a257420bda6d7e733b16707bebda3122c8183568a4d64cd794fc82e61af92b1a17b912a8dec3202619e3fda340748ca3e5d68f4ce7c53815d1f7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-attr \
python39-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
