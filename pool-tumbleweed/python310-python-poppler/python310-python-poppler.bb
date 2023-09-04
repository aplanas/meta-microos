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

RPM_NAME = "python310-python-poppler-0.2.2-4.1.aarch64.rpm"
RPM_HASH = "46d328dfd79cc1a93f56fd77a126518c14edc66d2fa8dc41255e82d47736c5356a5e4542bf19ef84889acf42ae67d9ce3f4f835be0e06efcb30ea0b8384e2ab2"

RPROVIDES:${PN} += "python3.10dist-python-poppler \
python310-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
