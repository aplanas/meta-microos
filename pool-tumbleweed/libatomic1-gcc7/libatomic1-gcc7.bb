SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libatomic1-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "f6be5c2ccbca8f73051414875ac05ee5d272b92b3a19cdbd6c439086548b2311c10b37e88bafe0ce70f9051f6729f2cef25d41e5fab150b3f89d73b49b22779d"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) \
libatomic1 \
libatomic1-gcc7 \
libatomic1-gcc7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
