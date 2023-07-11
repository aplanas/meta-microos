SUMMARY = "XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP (Extensible Metadata \
Platform) facilitates embedding metadata in files using a subset of \
RDF. Most notably, XMP supports embedding metadata in PDF and many \
image formats."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "libexempi8-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "0a0161b1117b2b872e7f7068d9b78faa3fc0a38c1b58fbdf1e27982eecf6a449da501e70c3bf58303e1af80aae8c733d493e93cc1d53d19c4066ec8f4ddd036d"

RPROVIDES:${PN} += "libexempi.so.8 \
libexempi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
