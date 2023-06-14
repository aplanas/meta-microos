SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_html-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "47bb9709f7c83844a8692a117e636b5398674490a627fa15d5c6c352f39930b0edb540b6a3f1080f3a25dfc70cc07611d74449d1e4ccdf5e8de6a166a8fb2d40"

RPROVIDES:${PN} += "libwx-gtk3u-html-suse-nostl.so.9.0.0 \
libwx-gtk3u-html-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
