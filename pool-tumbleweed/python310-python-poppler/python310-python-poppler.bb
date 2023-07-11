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

RPM_NAME = "python310-python-poppler-0.2.2-3.12.aarch64.rpm"
RPM_HASH = "85d45565e53877dae6d20c337b010d1b968a22f64cb7b6dd243bad6a7f6f75cb80c51ff913d0bfa02b2825b6ba802f7443c3ada3dd7e097da18806c4f3bb5632"

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
