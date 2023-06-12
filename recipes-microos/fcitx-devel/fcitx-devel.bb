SUMMARY = "Development files for fcitx"
DESCRIPTION = "Development header files for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-devel-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "3458432a0124a81b5c39072e988735f1023fa1e2f679c58af47a59c6c098203f102ae9e120a37a335ed7d93fc64661da79266ace48a7e1910f75f76750f11ba6"

RPROVIDES:${PN} += "cmake(Fcitx) \
fcitx-devel \
fcitx-devel(aarch-64) \
pkgconfig(fcitx) \
pkgconfig(fcitx-config) \
pkgconfig(fcitx-gclient) \
pkgconfig(fcitx-utils) \
rpm_macro(_fcitx_addondir) \
rpm_macro(_fcitx_autostartdir) \
rpm_macro(_fcitx_datadir) \
rpm_macro(_fcitx_descdir) \
rpm_macro(_fcitx_imicondir) \
rpm_macro(_fcitx_includedir) \
rpm_macro(_fcitx_inputmethoddir) \
rpm_macro(_fcitx_libdir) \
rpm_macro(_fcitx_libexecdir) \
rpm_macro(_fcitx_moduleincdir) \
rpm_macro(_fcitx_skindir) \
rpm_macro(_fcitx_tabledir) \
rpm_macro(fcitx_requires) \
rpm_macro(fcitx_table_requires)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/pkg-config \
fcitx \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfcitx-config4 \
libfcitx-core0 \
libfcitx-gclient1 \
libfcitx-utils.so.0()(64bit) \
libfcitx-utils0 \
libgettextpo.so.0()(64bit) \
pkgconfig(fcitx-config) \
pkgconfig(fcitx-utils) \
pkgconfig(gio-2.0)"

inherit rpm
