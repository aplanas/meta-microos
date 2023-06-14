SUMMARY = "Library That Defines Common Error Values for All GnuPG Components"
DESCRIPTION = "This is a library that defines common error values for all GnuPG \
components.  Among these are GPG, GPGSM, GPGME, GPG-Agent, libgcrypt, \
pinentry, SmartCard Daemon, and possibly more in the future."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.47"

RPM_NAME = "libgpg-error0-1.47-1.1.aarch64.rpm"
RPM_HASH = "073c92001645a0aed16f28323ce8d85ccc9d1a01355b1f1942be6691809e7742fe5f474ad85885fb0b587fa7fc520bf8314805c0d336e34c8dbc5eda6c4b84bf"

RPROVIDES:${PN} += "libgpg-error \
libgpg-error.so.0 \
libgpg-error0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
