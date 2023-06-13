SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_html-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "4a99dc57c3dfbf60ff97ef6733b4388082aceab79cad7061d65c33f9c44bfc220632cdc29d5e7b2ce744d83e3e48386cbdaccdfc8ead2985d35de18ab2cdec26"

RPROVIDES:${PN} += "libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse9_0_0 \
libwx_gtk3u_html-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmspack.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
