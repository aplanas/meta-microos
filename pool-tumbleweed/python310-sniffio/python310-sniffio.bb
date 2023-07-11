SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python310-sniffio-1.3.0-2.3.noarch.rpm"
RPM_HASH = "419dc2af550f9451328c379effbbe9526fc3ccb1bb8477f7baf02c75c69b1993d95efa2faffe6cfd900d59fea21ef7adc4aa93b1e7dc8480395700d95d82f10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sniffio \
python310-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
