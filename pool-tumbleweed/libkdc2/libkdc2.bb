SUMMARY = "Key Distribution Center library for Heimdal Kerberos"
DESCRIPTION = "This package contains the KDC support library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkdc2-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "64bd7b47087336308c4c049f9be9ad0445397c58654bdd09e3b4cd9238c2b0fdf3ead1861e431bcd679a81760e03a4eed4fbe86fd20f686cadb32b32c7d5e164"

RPROVIDES:${PN} += "libkdc.so.2()(64bit) \
libkdc.so.2(HEIMDAL_KDC_1.0)(64bit) \
libkdc2 \
libkdc2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libhcrypto.so.4()(64bit) \
libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit) \
libhdb.so.9()(64bit) \
libhdb.so.9(HEIMDAL_HDB_1.0)(64bit) \
libheimbase.so.1()(64bit) \
libheimbase.so.1(HEIMDAL_BASE_1.0)(64bit) \
libheimntlm.so.0()(64bit) \
libheimntlm.so.0(HEIMDAL_NTLM_1.0)(64bit) \
libhx509.so.5()(64bit) \
libhx509.so.5(HEIMDAL_X509_1.2)(64bit) \
libkrb5.so.26()(64bit) \
libkrb5.so.26(HEIMDAL_KRB5_2.0)(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit)"

inherit rpm
