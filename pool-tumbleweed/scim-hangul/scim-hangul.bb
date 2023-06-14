SUMMARY = "Hangul Input Method Engine for SCIM"
DESCRIPTION = "Hangul Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.4.0+git20140408.ee1d084"

RPM_NAME = "scim-hangul-0.4.0+git20140408.ee1d084-1.30.aarch64.rpm"
RPM_HASH = "5267f40b3e77c5fb25c87de49a341f9f6fb9cdf62626695bb55e681b60eb801c9ae6b28cad7e8892dc4bbe54816c9d3fa02cb47b433f93de8f83b61df60669bb"

RPROVIDES:${PN} += "scim-hangul"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhangul.so.1 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm
