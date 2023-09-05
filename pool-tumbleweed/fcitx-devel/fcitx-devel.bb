SUMMARY = "Development files for fcitx"
DESCRIPTION = "Development header files for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-devel-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "dcdf8817603b7e02662a4be9076f1300680ecef3eea966625598d8c94c4f380adc90600fd764a84c813bdfcf39b11c463e5be2baa77f4d550770289047d4edc4"

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
