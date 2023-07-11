SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libmsiecf-20221024-3.7.aarch64.rpm"
RPM_HASH = "ceaea6d0aa9c0e82dfe8e78939c8b07a51c241ef3d01c9f3f781d5dc2d30fed91cd3e1f65435e5aa9551bdc84480114822b11e993a5d89c1e73c7ce101dea7d4"

RPROVIDES:${PN} += "python310-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
