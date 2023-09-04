SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libmsiecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "04f1cca2694163823ca17840ecf56c86b27f48613ae55ce847aaa24ed6bb53fc4a5980f136d74bd633bf378105651a8d94f5a9d1e7cfa6e93af14753399e6ff3"

RPROVIDES:${PN} += "python39-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
