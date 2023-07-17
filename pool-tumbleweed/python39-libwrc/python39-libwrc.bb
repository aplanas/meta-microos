SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python39-libwrc-20230318-1.5.aarch64.rpm"
RPM_HASH = "10d2997a790d9fc11fb70e769c249739913b77fd59cbdeb568803a4f8ac8d4cacb0638fcaba8cd1f459a99259345a13ec802248e16f95d812cac0eda5edc1eb7"

RPROVIDES:${PN} += "python39-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
