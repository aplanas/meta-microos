SUMMARY = "Library with several forward error correction (FEC) functions"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP)."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "libfec3-3.0.0+git.20160910-5.4.aarch64.rpm"
RPM_HASH = "60913ad6932f6424a35d304e57e1be6ea60815c2d9b39ee0560eef76d632ed21199df09fe15ad711c367ecc3418005723e42aa8737779c8f129c00713eb48af1"

RPROVIDES:${PN} += "libfec.so.3 \
libfec3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
