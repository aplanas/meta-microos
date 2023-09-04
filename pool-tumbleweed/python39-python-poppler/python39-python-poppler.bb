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

RPM_NAME = "python39-python-poppler-0.2.2-4.1.aarch64.rpm"
RPM_HASH = "edd53a950298d836c78c54a6ac7f446af60a151a4a3df252d465328cdc6bc989d3e22806ada9fb0fc7dd6641a3af3b6c2a13b24cc82b3e638a0e26671b4819bc"

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
