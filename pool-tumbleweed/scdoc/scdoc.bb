SUMMARY = "A man page generator written in C99"
DESCRIPTION = "scdoc is a man page generator written for POSIX systems written in C99."
LICENSE = "MIT"

PV = "1.11.2"

RPM_NAME = "scdoc-1.11.2-1.7.aarch64.rpm"
RPM_HASH = "e87db684e811d2dc62b3c4b6db30783ad06e445d3324f2dcb4085cf4deb591e1968b9586c7b0440cd37e5ffb08569902dc138548d5776f1e57226205b6d32e1d"

RPROVIDES:${PN} += "pkgconfig(scdoc) \
scdoc \
scdoc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
