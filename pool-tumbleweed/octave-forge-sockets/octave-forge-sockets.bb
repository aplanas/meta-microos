SUMMARY = "Socket Octave functions for networking"
DESCRIPTION = "Socket functions for networking. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "octave-forge-sockets-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "5fdbf228ed2588523c8f01f6f375b799cab50ceeb179b56bf312a0f9b76a92445a75523fd24ed191446120b71d34113cdb1491a0a0ef53db60180c33f2c85541"

RPROVIDES:${PN} += "octave-forge-sockets \
octave-forge-sockets(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
