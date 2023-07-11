SUMMARY = "Viewer for dBase III and dBase IV Files"
DESCRIPTION = "dbview is a little tool that displays dBase III and IV files. You can \
also use it to convert your old .dbf files for further use with Unix."
LICENSE = "GPL-2.0+"

PV = "1.0.4"

RPM_NAME = "dbview-1.0.4-117.26.aarch64.rpm"
RPM_HASH = "f485a024524f359cff135a48cf14b54f523d57bcb76422939f85fba08dfcafdde802b164d6052dc869b44063908e0757fe2088d9c5d3182bc72bce5e4fc8609c"

RPROVIDES:${PN} += "dbview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
