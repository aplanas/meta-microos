SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_xrc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "764e34d81c8e371367ef850735eb0797b33623a6c58ad1db5fb1507f5cb4dab9e056a4f05c560ec20c3a651b7b8a859a21b69b2b70055cb210fdfafa2eb9e950"

RPROVIDES:${PN} += "libwx-gtk3u-xrc-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0"

inherit rpm
