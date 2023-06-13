SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_html-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ee459f86824ab4e0ccda9b8a46073c14885950ab0ee8154791aa175cb47ff1a0e9d8c9ad94ea79cb43f1a352754749d4d2a9193594bfdc84fb48d2d7b386fe6d"

RPROVIDES:${PN} += "libwx_qtu_html-suse.so.9.0.0()(64bit) \
libwx_qtu_html-suse9_0_0 \
libwx_qtu_html-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmspack.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit)"

inherit rpm
