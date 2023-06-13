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

RPM_NAME = "python310-python-poppler-0.2.2-3.11.aarch64.rpm"
RPM_HASH = "02e40ba521c83b0178e1ef24cb0b66d980d19c0084d9e9ba0cad8e004c57b2d74a52a900dc4e7e7d3376d2beeaeb5ebc3942820cc3b8e902b7d5e8e87aaadc53"

RPROVIDES:${PN} += "python3-python-poppler \
python3.10dist(python-poppler) \
python310-python-poppler \
python310-python-poppler(aarch-64) \
python3dist(python-poppler)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpoppler-cpp.so.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
