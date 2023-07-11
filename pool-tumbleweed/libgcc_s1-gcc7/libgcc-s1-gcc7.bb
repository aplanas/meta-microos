SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgcc_s1-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "f9babb278110b9a96566ff98d652bacc3901133e266721188f2a1c64530b62ac5db8854c9d0cab9737f87077546791dccb90a9f5c6938962ad9b65a136052615"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
