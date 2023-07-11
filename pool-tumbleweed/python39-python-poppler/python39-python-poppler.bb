SUMMARY = "Python binding to the poppler-cpp library"
DESCRIPTION = "python-poppler is a Python binding to the poppler-cpp library. It allows to \
read, render, or modify PDF documents. More specifically, it currently allows \
to: \
    read an modify document meta data; \
    list and read embedded documents; \
    list the fonts used by the document; \
    search or extract text on a given page of the document; \
    render a page to a raw image; \
    get info about transitions effects between the pages; \
    read the table of contents of the document."
LICENSE = "GPL-2.0-only"

PV = "0.2.2"

RPM_NAME = "python39-python-poppler-0.2.2-3.12.aarch64.rpm"
RPM_HASH = "ae5735ab96e4d68312dc655af4a879990245d2a1a038d2d4c77320e0a17efaf7cd525e51ce1b602d84ef934d3e41e5a1097b8dc28213dc4d283700bfc0c9a110"

RPROVIDES:${PN} += "python3.9dist-python-poppler \
python39-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
