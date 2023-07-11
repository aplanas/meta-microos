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

RPM_NAME = "python311-python-poppler-0.2.2-3.12.aarch64.rpm"
RPM_HASH = "90be00cc8aba483f46373407328c7d06ded3050b752c6916d79b0685d46357ddc35a129b89533b5a5981743e99b29db68fa9e0ff951ed011244dea1fa2519b90"

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
