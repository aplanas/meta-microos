SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "MIT"

PV = "0.9.3~0"

RPM_NAME = "bottom-0.9.3~0-1.1.aarch64.rpm"
RPM_HASH = "c6861a44a49ca4000ac7db305ddc4d6590e54f8346452aa89713c76a55127b0002ddc01d6b7ae83160d02553dbb35797c16f8c35fe2c2f304f5fdbcc147811cb"

RPROVIDES:${PN} += "bottom"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
