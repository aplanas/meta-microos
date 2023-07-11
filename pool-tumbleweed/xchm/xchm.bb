SUMMARY = "A wxWidgets CHM document viewer"
DESCRIPTION = "xCHM is a GUI frontend for CHMLIB, written with wxGTK. It is able to \
display the topics tree, work with displayed pages history, print the \
current page, work with bookmarks, change fonts and fast search \
through all the pages of the loaded .chm document."
LICENSE = "GPL-2.0-or-later"

PV = "1.35"

RPM_NAME = "xchm-1.35-1.5.aarch64.rpm"
RPM_HASH = "bcce311b17992e6613d8c3f9ba61254e96222ad5b047aea6d2545d26e2b701b1f6ddce9fb7849d88e18a2f3f530c87be2715a71ae85e9001823a9e7c05af31ea"

RPROVIDES:${PN} += "xchm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
