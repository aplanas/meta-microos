SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python311-sniffio-1.3.0-2.3.noarch.rpm"
RPM_HASH = "1ac041082173eaee852606f02b24cd7ac57e7bcb7f813d2ba24cd602865d3cfd5a04c6499f800724105a6137a528794413ba35c9c2917207dd507e328167244c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sniffio \
python3.11dist-sniffio \
python311-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
