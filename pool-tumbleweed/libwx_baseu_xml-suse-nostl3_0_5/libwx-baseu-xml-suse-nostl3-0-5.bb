SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "1df7c4a99e813da5de24aac4332cfffcc4b3356851129f74501c13b6c8eea1e7c257adcc2259f1eb849da3a0c8d7028d8015877bc63802629484b7dea7d6e09f"

RPROVIDES:${PN} += "libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5"

inherit rpm
