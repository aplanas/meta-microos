SUMMARY = "Overlay volume (or anything) bar for the X Window System"
DESCRIPTION = "Overlay volume (or anything) bar for the X Window System"
LICENSE = "GPL-3.0-only"

PV = "0.3"

RPM_NAME = "xob-0.3-1.7.aarch64.rpm"
RPM_HASH = "801181be1ecba25f59942398cf3a76694798d7092e65d1850a2087a897ceeaa65eacc509a9a949c99513d6b43eb353e05039be872a00ddbb2a7e8c0d6e7332f8"

RPROVIDES:${PN} += "xob \
xob(aarch-64)"

RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libconfig.so.11()(64bit)"

inherit rpm
