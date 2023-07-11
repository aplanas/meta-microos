SUMMARY = "Development files for libt3widget, a terminal dialog library"
DESCRIPTION = "The libt3widget library provides a C++ dialog toolkit. It provides \
objects for dialogs and widgets like buttons, text fields, check \
boxes etc., to facilitate easy construction of dialog based programs \
for Unix-type terminals. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3widget."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "libt3widget-devel-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "623880c9fdc73f641d955699c9eb6a21b514c8926e99ff423dd8c85967c0a3b01343b2ef6810db73a27591a3890f56f60bc555159bb53c3f6d7c1010a9fff315"

RPROVIDES:${PN} += "libt3widget-devel \
pkgconfig-libt3widget"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libt3widget2 \
libxcb.so.1 \
pkgconfig-libpcre2-8 \
pkgconfig-libt3key \
pkgconfig-libt3window \
pkgconfig-libtranscript"

inherit rpm
