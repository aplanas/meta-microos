SUMMARY = "Keyserver, CRL, and OCSP access for GnuPG"
DESCRIPTION = "Since version  2.1 of GnuPG, dirmngr takes care of accessing the OpenPGP \
keyservers. As with previous versions it is also used as a server for managing \
and downloading certificate \
revocation lists (CRLs) for X.509 certificates, downloading X.509 certificates, \
and providing access to OCSP providers.  Dirmngr is invoked internally by gpg, \
gpgsm, or via the gpg-connect-agent tool."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "dirmngr-2.3.8-3.1.aarch64.rpm"
RPM_HASH = "6d6121caa6f37e316a3ce29cb1c183c09623215e20915c26c7ebab2d106a7d96f13cfb2012c12fd3353c790bfb22fd7dd228d2a3b28a42d323298127de1a3487"

RPROVIDES:${PN} += "dirmngr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0 \
libksba.so.8 \
liblber.so.2 \
libldap.so.2 \
libnpth.so.0"

inherit rpm
