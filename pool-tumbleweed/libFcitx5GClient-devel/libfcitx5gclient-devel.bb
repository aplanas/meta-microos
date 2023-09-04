SUMMARY = "Development files for libFcitx5GClient"
DESCRIPTION = "This package provides development files for libFcitx5GClient."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5GClient-devel-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "90e05cce243fc485222742c381c717bf7a089586d8e60c2640773844c904c87dd6fb48f9ce6f2725456a8d4cec7d5f58e2be31d072557ac723ccc2e74c7691bb"

RPROVIDES:${PN} += "cmake-Fcitx5GClient \
libFcitx5GClient-devel \
pkgconfig-Fcitx5GClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFcitx5GClient2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
