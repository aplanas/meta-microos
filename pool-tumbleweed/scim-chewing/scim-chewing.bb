SUMMARY = "Chewing IM engine for SCIM platform"
DESCRIPTION = "Chewing IM engine for SCIM platform."
LICENSE = "GPL-2.0+"

PV = "0.3.6+git20150821.5df4075"

RPM_NAME = "scim-chewing-0.3.6+git20150821.5df4075-1.31.aarch64.rpm"
RPM_HASH = "35dd2501752b4e210b64fde1b5d36b4fe6187d519640b5394405060910031a32304365e3d4d554b134169c8015252a4c52a4832d1b3f5599a37780227aecf727"

RPROVIDES:${PN} += "scim-chewing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libchewing.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm
