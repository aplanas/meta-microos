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

RPM_NAME = "libt3widget-devel-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "08f19719dc5f2d8948fefc89ad32c9ec69384fa51192e4820b4758075d9e85f17f14045c8274d49bb3ff648a33027f935c585a974899c84623956199ed93e057"

RPROVIDES:${PN} += "libt3widget-devel \
libt3widget-devel(aarch-64) \
pkgconfig(libt3widget)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libt3widget2 \
libxcb.so.1()(64bit) \
pkgconfig(libpcre2-8) \
pkgconfig(libt3key) \
pkgconfig(libt3window) \
pkgconfig(libtranscript)"

inherit rpm
