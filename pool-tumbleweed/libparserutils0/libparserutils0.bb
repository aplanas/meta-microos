SUMMARY = "A library for building efficient parsers"
DESCRIPTION = "LibParserUtils is a library for building efficient parsers, written in \
C. It was developed as part of the NetSurf project."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "libparserutils0-0.2.4-2.8.aarch64.rpm"
RPM_HASH = "b380b21aa6dae41f3b576508b6db5f118a5b3e1fa3ff397e2bf9d059f067ca9e115092da5fa7ae3231c8b43a0669202c502819751cee4bebc68756ad5b60ad70"

RPROVIDES:${PN} += "libparserutils.so.0()(64bit) \
libparserutils0 \
libparserutils0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
