SUMMARY = "Quaternion class with overloaded operators for Octave"
DESCRIPTION = "Quaternion class with overloaded operators. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "octave-forge-quaternion-2.4.0-1.30.aarch64.rpm"
RPM_HASH = "55da8c3291af4d8ac430eb5da6a828e3a2721945494fc47658cf6b4ca60850d7de46452cf31f7d125ccf4ae451d7ba64674c34360b37db3cf4b8d222ec424f60"

RPROVIDES:${PN} += "octave-forge-quaternion"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
