SUMMARY = "Chewing IM engine for SCIM platform"
DESCRIPTION = "Chewing IM engine for SCIM platform."
LICENSE = "GPL-2.0+"

PV = "0.3.6+git20150821.5df4075"

RPM_NAME = "scim-chewing-0.3.6+git20150821.5df4075-1.32.aarch64.rpm"
RPM_HASH = "0cdceb87d67fee0cd4f0eb4277e694febaba95d350f2373fd771e5db9038a6fe171b537c2513030f089f74cb70d68aad7e3a2f2a1155762b6c13314b995de9e1"

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
