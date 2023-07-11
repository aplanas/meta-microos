SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-formats-0.1.1-1.15.noarch.rpm"
RPM_HASH = "17a23cc0bdadcabe9038931e4855b0ebf9960f8d3b33926e7fd49fb4f38ded0488604d72c85b34fbaff31fb0151548f9ebc160327ea04bb8ad63739f4378b00b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-formats \
python310-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
