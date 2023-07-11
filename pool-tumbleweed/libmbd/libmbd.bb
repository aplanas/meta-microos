SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "41139121e59c02adb762d315b50590a09e2f9de916f1fd1a0581c7e5f5b625d619ead93371e40be17a7a0a04b191e89746a237b69fb100639b1232faaa1c0d19"

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
