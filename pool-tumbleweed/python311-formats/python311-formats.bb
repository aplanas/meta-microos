SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-formats-0.1.1-1.15.noarch.rpm"
RPM_HASH = "9210f6eac2985addf505a23a562d9f10657a66eeec4e886288182061ec9105693e80de87a70e881a1aaf65ebe4a8c2a440069d0e2d0c7dabb26f5fa2df0dafd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-formats \
python3.11dist-formats \
python311-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
