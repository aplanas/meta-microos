SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2) \
 \
gpgme also uses libassuan to communicate with a libassuan-enabled GnuPG \
v2 server, but it uses it's own copy of libassuan."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.5.6"

RPM_NAME = "libassuan-devel-2.5.6-1.1.aarch64.rpm"
RPM_HASH = "6cda9887cb72f0b12bbbdd6f3cafec824aa09bfa1617aaceaa3e796f055fce45536faf1d31c259297df8ca8e1d2563185529facfee2c1f3560086e010bea0371"

RPROVIDES:${PN} += "libassuan-devel \
pkgconfig-libassuan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libassuan0 \
libgpg-error-devel \
pkgconfig-gpg-error"

inherit rpm
