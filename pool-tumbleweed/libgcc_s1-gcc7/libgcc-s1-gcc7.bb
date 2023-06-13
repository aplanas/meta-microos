SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgcc_s1-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "1d2adcba07656cd5f02b9eb748a87b42f161562b7c7a33567912e7ef7cc53ae12f760bb53293d4ed2e71757bbff2eb1ba8ecd2bd4bfa715224275ef11a2ba971"

RPROVIDES:${PN} += "libgcc_s.so.1()(64bit) \
libgcc_s1 \
libgcc_s1-gcc7 \
libgcc_s1-gcc7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
