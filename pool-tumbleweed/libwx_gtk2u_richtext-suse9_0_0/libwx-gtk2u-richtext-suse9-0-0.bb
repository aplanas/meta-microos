SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_richtext-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "9a1c64b30e19fdcff5fcef29caeb329475d341e283cd6e238362ac73beb8d5e6579b95050099a9f1ce68fb99d0a1ab713434e50c19946dbd53b12b42ea61ae1e"

RPROVIDES:${PN} += "libwx_gtk2u_richtext-suse.so.9.0.0()(64bit) \
libwx_gtk2u_richtext-suse9_0_0 \
libwx_gtk2u_richtext-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit)"

inherit rpm
