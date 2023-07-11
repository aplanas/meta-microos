SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "8aac06f7b976b31c53d091577406febe02365a63c2b2acb7999deacc2b0ae607291693d43a0c2ba1a9aa63f8d84ae7c2a2fb13cd25227841968f9ee6974225aa"

RPROVIDES:${PN} += "libwx-baseu-xml-suse.so.3.0.5 \
libwx-baseu-xml-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5"

inherit rpm
