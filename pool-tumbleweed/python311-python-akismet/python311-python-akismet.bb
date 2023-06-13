SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python311-python-akismet-0.4.3-1.3.noarch.rpm"
RPM_HASH = "c79a37aa1ea7525d651030494952e1ec76d0c0f2df73c0395454b87e294400db09ed2adde0503677cfb33c5f12ef67feb780254075929b14d74ed2636bf47ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-akismet) \
python311-python-akismet \
python3dist(python-akismet)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
