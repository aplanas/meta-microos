SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-promise-2.3.0-4.3.noarch.rpm"
RPM_HASH = "48dc7b1e9e090ca7b4c76bfb16d4fb6dadb5c8804529cbcbc771ed62c1a7781fec1ea892c9a5e61858e71b0806b25cc5051ccd7d903a22827f0fb8f7ead431c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-promise \
python3.11dist-promise \
python311-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
