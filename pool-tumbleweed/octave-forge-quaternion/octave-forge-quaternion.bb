SUMMARY = "Quaternion class with overloaded operators for Octave"
DESCRIPTION = "Quaternion class with overloaded operators. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "octave-forge-quaternion-2.4.0-1.29.aarch64.rpm"
RPM_HASH = "ba9539ee76568590d0f4cdfd67e52b9207de2a4f77aa6a79b8216e0e04953ff3a9f9497648ed36c48384392ac1d20c6c6612264b8a69a5b17429b69e2bebecfe"

RPROVIDES:${PN} += "octave-forge-quaternion"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
