SUMMARY = "Cross-platform GUI library"
DESCRIPTION = "ZLibrary is a cross-platform library to build applications running on \
desktop Linux, Windows, and different Linux-based PDAs."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary0_99-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "b99690b8268bfa7c121fed63e93b826812748ffabfabf15fd8620660f7773eaaea04645bbd74b0b68acbc7ef323f0742f586c4f3c5b84d198be20ad5dfd33b79"

RPROVIDES:${PN} += "libzlcore.so.0.99()(64bit) \
libzltext.so.0.99()(64bit) \
zlibrary0_99 \
zlibrary0_99(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libunibreak.so.5()(64bit) \
libz.so.1()(64bit) \
zlibrary-data \
zlibrary-ui"

inherit rpm
