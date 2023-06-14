SUMMARY = "Cross-platform GUI library"
DESCRIPTION = "ZLibrary is a cross-platform library to build applications running on \
desktop Linux, Windows, and different Linux-based PDAs."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary0_99-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "b99690b8268bfa7c121fed63e93b826812748ffabfabf15fd8620660f7773eaaea04645bbd74b0b68acbc7ef323f0742f586c4f3c5b84d198be20ad5dfd33b79"

RPROVIDES:${PN} += "libzlcore.so.0.99 \
libzltext.so.0.99 \
zlibrary0-99"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbz2.so.1 \
libc.so.6 \
libexpat.so.1 \
libfribidi.so.0 \
libstdc++.so.6 \
libunibreak.so.5 \
libz.so.1 \
zlibrary-data \
zlibrary-ui"

inherit rpm
