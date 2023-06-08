SUMMARY = "Keyserver, CRL, and OCSP access for GnuPG"
DESCRIPTION = "Since version  2.1 of GnuPG, dirmngr takes care of accessing the OpenPGP \
keyservers. As with previous versions it is also used as a server for managing \
and downloading certificate \
revocation lists (CRLs) for X.509 certificates, downloading X.509 certificates, \
and providing access to OCSP providers.  Dirmngr is invoked internally by gpg, \
gpgsm, or via the gpg-connect-agent tool."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "dirmngr-2.3.8-1.3.aarch64.rpm"
RPM_HASH = "dd84618ce2a9dadec77efc5d25531496790c16b0659a15d22e2fe0eac4ff49cf0aaa60bbcc59242f3617f5f706a0397654a0604714ba458f13256c7512b1487d"

RPROVIDES:${PN} += "dirmngr dirmngr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libassuan.so.0()(64bit) libassuan.so.0(LIBASSUAN_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) libksba.so.8()(64bit) libksba.so.8(KSBA_0.9)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnpth.so.0()(64bit) libnpth.so.0(NPTH_1.0)(64bit)"

inherit rpm
