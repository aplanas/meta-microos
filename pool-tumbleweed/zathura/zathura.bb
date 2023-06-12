SUMMARY = "A customizable document viewer"
DESCRIPTION = "zathura is a customizable document viewer. It provides a minimalistic \
and space-saving interface as well as a keyboard-centric interaction."
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "18f6b90934eb664ca538d064c4621a58b4614439733989b451f4864acfa4f42082a7631e12f896891375367d22b817336702618c715548d6f576646452f16999"

RPROVIDES:${PN} += "application() \
application(org.pwmt.zathura.desktop) \
metainfo() \
metainfo(org.pwmt.zathura.appdata.xml) \
zathura \
zathura(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirara-gtk3.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmagic.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libseccomp.so.2()(64bit) \
libsqlite3.so.0()(64bit) \
libsynctex.so.2()(64bit)"

inherit rpm
