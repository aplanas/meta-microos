SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2) \
 \
gpgme also uses libassuan to communicate with a libassuan-enabled GnuPG \
v2 server, but it uses it's own copy of libassuan."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.5.5"

RPM_NAME = "libassuan-devel-2.5.5-1.8.aarch64.rpm"
RPM_HASH = "335ff5e8253fc7a42e8ad43c5df15d2ee91ad36535155ea25aca794486170789121fc4e39b0c5b63a399a065ace0e18e869997c56eb3f24c0a38a37464033724"

RPROVIDES:${PN} += "libassuan-devel \
libassuan-devel(aarch-64) \
pkgconfig(libassuan)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libassuan0 \
libgpg-error-devel \
pkgconfig(gpg-error)"

inherit rpm
