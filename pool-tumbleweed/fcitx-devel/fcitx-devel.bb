SUMMARY = "Development files for fcitx"
DESCRIPTION = "Development header files for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-devel-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "a4ef0ecc3ec48726dceddd4e9ed5b7e9ffe37fc090f99e4c2f4f7b7e10a670445404d7876b35515fcf354c91802160d431c939a74c1d90d4328fd2a6fccd50dd"

RPROVIDES:${PN} += "cmake-Fcitx \
fcitx-devel \
pkgconfig-fcitx \
pkgconfig-fcitx-config \
pkgconfig-fcitx-gclient \
pkgconfig-fcitx-utils \
rpm-macro--fcitx-addondir \
rpm-macro--fcitx-autostartdir \
rpm-macro--fcitx-datadir \
rpm-macro--fcitx-descdir \
rpm-macro--fcitx-imicondir \
rpm-macro--fcitx-includedir \
rpm-macro--fcitx-inputmethoddir \
rpm-macro--fcitx-libdir \
rpm-macro--fcitx-libexecdir \
rpm-macro--fcitx-moduleincdir \
rpm-macro--fcitx-skindir \
rpm-macro--fcitx-tabledir \
rpm-macro-fcitx-requires \
rpm-macro-fcitx-table-requires"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
fcitx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config4 \
libfcitx-core0 \
libfcitx-gclient1 \
libfcitx-utils.so.0 \
libfcitx-utils0 \
libgettextpo.so.0 \
pkgconfig-fcitx-config \
pkgconfig-fcitx-utils \
pkgconfig-gio-2.0"

inherit rpm
