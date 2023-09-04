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

RPM_NAME = "python311-python-poppler-0.2.2-4.1.aarch64.rpm"
RPM_HASH = "ffbcd67be4de866fd640a890d6197e1c97c492671ad846d135f18697f1c0d67b2c985c85e710732a160ca98cba6defce67e5ad567cdc6fc3da4558eee3485508"

RPROVIDES:${PN} += "python3-python-poppler \
python3.11dist-python-poppler \
python311-python-poppler \
python3dist-python-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
