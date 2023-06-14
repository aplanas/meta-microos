SUMMARY = "Image burner"
DESCRIPTION = "An image burner, written especially for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "imageburner-1.0.2-1.18.aarch64.rpm"
RPM_HASH = "9b913ff8ae2174986c8b707bd79947785d7be5739a12f0ba24b9d219a6e24ccd123732bc215de39ab182e384bab0acedb2bd65f6d1594fe9a07db5847789abd6"

RPROVIDES:${PN} += "imageburner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
