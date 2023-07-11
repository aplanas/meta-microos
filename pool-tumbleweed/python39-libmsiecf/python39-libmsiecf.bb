SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libmsiecf-20221024-3.7.aarch64.rpm"
RPM_HASH = "5287998b3689131c2563720ab2a5f823f7efa0338c7d1aa0cf5623faed329067ecdd63c47fdeac80ce685383024ae54967a819ccd1c9a5e68fb785ee2f7271cd"

RPROVIDES:${PN} += "python39-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
