SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_richtext-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "801db7c5fcfd157dcde47dd8cb1ae27a9333daf4c632769355823f9e2c31d316aebe67916a60bef491c9c235356275172f4aa418adf6462fd8cbb424066d942e"

RPROVIDES:${PN} += "libwx-gtk3u-richtext-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0"

inherit rpm
