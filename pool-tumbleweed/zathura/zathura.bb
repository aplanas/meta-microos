SUMMARY = "A customizable document viewer"
DESCRIPTION = "zathura is a customizable document viewer. It provides a minimalistic \
and space-saving interface as well as a keyboard-centric interaction."
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "18f6b90934eb664ca538d064c4621a58b4614439733989b451f4864acfa4f42082a7631e12f896891375367d22b817336702618c715548d6f576646452f16999"

RPROVIDES:${PN} += "zathura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libgirara-gtk3.so.3 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmagic.so.1 \
libpango-1.0.so.0 \
libseccomp.so.2 \
libsqlite3.so.0 \
libsynctex.so.2"

inherit rpm
