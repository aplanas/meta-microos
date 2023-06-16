SUMMARY = "Development files for fcitx"
DESCRIPTION = "Development header files for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-devel-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "3458432a0124a81b5c39072e988735f1023fa1e2f679c58af47a59c6c098203f102ae9e120a37a335ed7d93fc64661da79266ace48a7e1910f75f76750f11ba6"

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
