SUMMARY = "Image burner"
DESCRIPTION = "An image burner, written especially for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "imageburner-1.0.2-1.18.aarch64.rpm"
RPM_HASH = "9b913ff8ae2174986c8b707bd79947785d7be5739a12f0ba24b9d219a6e24ccd123732bc215de39ab182e384bab0acedb2bd65f6d1594fe9a07db5847789abd6"

RPROVIDES:${PN} += "application() \
application(com.github.artemanufrij.imageburner.desktop) \
imageburner \
imageburner(aarch-64) \
metainfo() \
metainfo(com.github.artemanufrij.imageburner.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
