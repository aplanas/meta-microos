SUMMARY = "Development files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the development and header files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.4"

RPM_NAME = "callaudiod-devel-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "229eb06d9f58bb49d0f983a2f5011953daa902b04888a02b3fa7fe9463a6284f19dacfea5d826491503ab34a829b12ff4e32996760f46de4a5b7ad233ab4a09e"

RPROVIDES:${PN} += "callaudiod-devel callaudiod-devel(aarch-64) pkgconfig(libcallaudio-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config callaudiod libcallaudio0_1-0 pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(gobject-2.0)"

inherit rpm
