SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_html-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "4a99dc57c3dfbf60ff97ef6733b4388082aceab79cad7061d65c33f9c44bfc220632cdc29d5e7b2ce744d83e3e48386cbdaccdfc8ead2985d35de18ab2cdec26"

RPROVIDES:${PN} += "libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-html-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
