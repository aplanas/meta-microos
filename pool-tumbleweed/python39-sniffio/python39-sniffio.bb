SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python39-sniffio-1.3.0-2.3.noarch.rpm"
RPM_HASH = "2f821694aebb9f15ae52b8cab772d7920a7cf199c9448301c73f53323ec3c2da3b900396c52a470233dd47b0d9e199225ecae203bdc85e9636b6fa0fe07f9618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sniffio \
python39-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
