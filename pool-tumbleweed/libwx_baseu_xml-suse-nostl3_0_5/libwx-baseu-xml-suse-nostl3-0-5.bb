SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "1da8f842233ae284ef52acdf974386b9cb2e6bddfe558d63e14698bf6d82338abf92b5a23ff7badd9f820dc74d27db972babb69b5b904631ee9987660e7ecd4c"

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
