SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python311-sniffio-1.3.0-2.1.noarch.rpm"
RPM_HASH = "a907deb6a8be6eeac9d12090b05e1aa9155fc88c706cc9e6e3be9e7c20708be8bba824de4bc24608d8c54b7c5ccf022428aac01cdeb288cf3198ed3e0365aa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sniffio \
python311-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
