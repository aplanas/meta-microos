SUMMARY = "EXSLT Library"
DESCRIPTION = "This is the EXSLT C library developed for libxslt. \
EXSLT is a community initiative to provide extensions to XSLT."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.38"

RPM_NAME = "libexslt0-1.1.38-1.1.aarch64.rpm"
RPM_HASH = "c8fcd9a3be51e1474af435ed35cdda07421cd4787766d48289a945a7e440051271a93a2f8f9d103fcd84df736846357464d59facdc5ac3b1a2fd74b93fa3db4e"

RPROVIDES:${PN} += "libexslt.so.0 \
libexslt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libm.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
