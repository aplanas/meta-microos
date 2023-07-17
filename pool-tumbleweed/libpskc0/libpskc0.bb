SUMMARY = "Library for Portable Symmetric Key Container"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.8"

RPM_NAME = "libpskc0-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "50eb8ca8ff65325bc1caa5dc0cbc5300896b1fa4bef1d69f5c9d65fae30f2e6d1e04a5ceb72069205dbe16e6fd5445ddcc8ab1be4391face19ef15a6b2f0c025"

RPROVIDES:${PN} += "libpskc.so.0 \
libpskc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1"

inherit rpm
