SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libmsiecf-20221024-3.7.aarch64.rpm"
RPM_HASH = "b0db0f82c4af86319ddd2cc67b1645c2b2b40c34205f0cf24a3ff32612daf7520e698591c84b45208335366214e0fe5e65657fd644923c705356a375fd3ff297"

RPROVIDES:${PN} += "python3-libmsiecf \
python311-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
