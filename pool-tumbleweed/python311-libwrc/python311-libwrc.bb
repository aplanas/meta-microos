SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python311-libwrc-20230318-1.2.aarch64.rpm"
RPM_HASH = "d8bf5219d33d4ecf43b9d7b1add1871a8cb95fc3c0e790be2f830bddaefd62961e1efd05d5ebc6fcf8a139dac471c3378501d493c933e3726a36cdff85258453"

RPROVIDES:${PN} += "python311-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
