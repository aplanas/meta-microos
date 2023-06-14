SUMMARY = "Python Support for the DjVu Image Format"
DESCRIPTION = "python-djvulibre is a set of Python bindings for the DjVuLibre library, \
an open source implementation of DjVu."
LICENSE = "GPL-2.0-only"

PV = "0.8.6"

RPM_NAME = "python311-djvulibre-0.8.6-2.12.aarch64.rpm"
RPM_HASH = "182fbfb7914455318c71022230a07364daaef65b906ecbf1e59276726b0b1ed2cdb9820b49738019647dbe23f47712249aad85064e727b842c3afe3f169f3210"

RPROVIDES:${PN} += "python3.11dist-python-djvulibre \
python311-djvulibre \
python3dist-python-djvulibre"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdjvulibre.so.21 \
python-abi"

inherit rpm
