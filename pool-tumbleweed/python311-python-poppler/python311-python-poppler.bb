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

RPM_NAME = "python311-python-poppler-0.2.2-3.11.aarch64.rpm"
RPM_HASH = "76fca91e3963e50443f22a5186027482fcd75bc11ca557cfbb15d3f0763e2b65110589bea0ac70bdd5ffbb5ab27ab25ae924a63125960472f2c6b93f7aa00c12"

RPROVIDES:${PN} += "python3.11dist-python-poppler \
python311-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
