SUMMARY = "EXSLT Library"
DESCRIPTION = "This is the EXSLT C library developed for libxslt. \
EXSLT is a community initiative to provide extensions to XSLT."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.38"

RPM_NAME = "libexslt0-1.1.38-1.1.aarch64.rpm"
RPM_HASH = "c8fcd9a3be51e1474af435ed35cdda07421cd4787766d48289a945a7e440051271a93a2f8f9d103fcd84df736846357464d59facdc5ac3b1a2fd74b93fa3db4e"

RPROVIDES:${PN} += "libexslt.so.0()(64bit) \
libexslt0 \
libexslt0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.9)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.8.0)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libxslt.so.1(LIBXML2_1.0.30)(64bit) \
libxslt.so.1(LIBXML2_1.0.32)(64bit) \
libxslt.so.1(LIBXML2_1.1.18)(64bit) \
libxslt.so.1(LIBXML2_1.1.20)(64bit) \
libxslt.so.1(LIBXML2_1.1.25)(64bit) \
libxslt.so.1(LIBXML2_1.1.27)(64bit) \
libxslt.so.1(LIBXML2_1.1.30)(64bit)"

inherit rpm
