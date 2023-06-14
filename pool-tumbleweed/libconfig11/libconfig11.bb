SUMMARY = "C API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig11-1.7.3-1.8.aarch64.rpm"
RPM_HASH = "adda9b815c6a4e47f4729c811655757afb06248499d83105f3a3df24b8336148a93a1674a03f4d29a10d62662dc095a0b2bd723c4b843b4f691043f3d8cd99cb"

RPROVIDES:${PN} += "libconfig.so.11 \
libconfig11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
