SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python39-libwrc-20230318-2.1.aarch64.rpm"
RPM_HASH = "9fede80bb5a766ac3350b6df4f41952ddf83869dfe836eda6741158da09b078fc05a29e4ceebbb709c7ff56f631ffed92c2694c213c841e156d7173abf702589"

RPROVIDES:${PN} += "python39-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
