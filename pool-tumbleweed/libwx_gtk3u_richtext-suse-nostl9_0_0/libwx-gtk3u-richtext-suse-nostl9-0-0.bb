SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_richtext-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "7738af7d5870cce18aa8a98879501e0057a638f8ba73331650cfde67cae0b1b283c31339d5b82428d82998a8a24a717b5c1f717d375edb712dea816e2662bdc2"

RPROVIDES:${PN} += "libwx-gtk3u-richtext-suse-nostl.so.9.0.0 \
libwx-gtk3u-richtext-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-baseu-xml-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0 \
libwx-gtk3u-html-suse-nostl.so.9.0.0"

inherit rpm
