SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_xrc-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "79e635d98791a40879d710a869eabe695c66d6cd8ca2810f99d49f7fd2658a611630685a9bf9ab73328a534fda09847a1f28bfe9be59d7d27489a55bc175a4ab"

RPROVIDES:${PN} += "libwx_gtk3u_xrc-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_xrc-suse-nostl9_0_0 \
libwx_gtk3u_xrc-suse-nostl9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse-nostl.so.9.0.0()(64bit)"

inherit rpm
