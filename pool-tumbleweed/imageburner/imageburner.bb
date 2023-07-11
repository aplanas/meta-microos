SUMMARY = "Image burner"
DESCRIPTION = "An image burner, written especially for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "imageburner-1.0.2-1.19.aarch64.rpm"
RPM_HASH = "37eb90a0a9828cfa1603633268f7ec7ba4227a01f2c61e0a406d8e233745927088c717d5ae824bb88c8a51c527e6f6b0de6a2d43599e66d844193a320e0020e4"

RPROVIDES:${PN} += "imageburner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
