SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_richtext-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "7601c83a8d920c43aba64d33c2519132e9e7e6900a9ad7275cc51b2a23ac90091ec35153192f8239a1996136bbb066e1c2d9fe5a9aac6c6a0c4a37989dadb01f"

RPROVIDES:${PN} += "libwx_qtu_richtext-suse.so.9.0.0()(64bit) \
libwx_qtu_richtext-suse9_0_0 \
libwx_qtu_richtext-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit) \
libwx_qtu_html-suse.so.9.0.0()(64bit)"

inherit rpm
