SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "0e63eae1b876e49849d39ea51343e82a20cc931810edc159ae6e164a7edad63c2679f8940eee7452148f732b88ffed680fed1e233038030800ec5de6c0d8836b"

RPROVIDES:${PN} += "libmbd \
libmbd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
