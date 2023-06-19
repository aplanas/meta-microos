SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_html-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "1778a670feeabc6eaa15c06b210d19e848e6a4aeb565b5c1248e5a75c9b4a7540bd56c9ab52f5374e100125dede6f7808b595dab9be5103acbe276ba072f401f"

RPROVIDES:${PN} += "libwx-gtk2u-html-suse.so.9.0.0 \
libwx-gtk2u-html-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
