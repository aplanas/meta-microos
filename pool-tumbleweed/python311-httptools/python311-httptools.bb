SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-httptools-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "6277b704ade2677f73922aadb8246a8325613ad3a43677deb41b00e46818ae896e5892a03a051f8cb657e4baa8ebeb9de0de2b77f44ccdc34876e823cd2bccda"

RPROVIDES:${PN} += "python3-httptools \
python3.11dist-httptools \
python311-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
