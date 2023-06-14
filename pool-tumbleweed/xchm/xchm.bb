SUMMARY = "A wxWidgets CHM document viewer"
DESCRIPTION = "xCHM is a GUI frontend for CHMLIB, written with wxGTK. It is able to \
display the topics tree, work with displayed pages history, print the \
current page, work with bookmarks, change fonts and fast search \
through all the pages of the loaded .chm document."
LICENSE = "GPL-2.0-or-later"

PV = "1.35"

RPM_NAME = "xchm-1.35-1.4.aarch64.rpm"
RPM_HASH = "bbf82dcccc288bfece35c61c6950b318c96b474845f19d603aad3c864a3fbe1b7df821afdab7993c28da59a5b1cb54a301baf1f2307905bd6e9850af6358368d"

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
