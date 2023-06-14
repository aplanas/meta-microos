SUMMARY = "XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP (Extensible Metadata \
Platform) facilitates embedding metadata in files using a subset of \
RDF. Most notably, XMP supports embedding metadata in PDF and many \
image formats."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "libexempi8-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "dcc66cb6c9e5afbe43bfdbd32f4b64f117f624d3238d0139fe1ab49565bafbf922c927f9fe318b86d2ad50d3343d633632beb52b8adcc46aa07a9ccb0a13769f"

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
