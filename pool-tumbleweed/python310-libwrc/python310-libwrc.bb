SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python310-libwrc-20230318-2.1.aarch64.rpm"
RPM_HASH = "54ed52b6e21c611a7c309fc3246295d07feda3b2f6af1472b637fb491f6e89b4f28f2fa8f2e109ef7d0704e5a30e3dc083529e931118a62ec377c9751f715264"

RPROVIDES:${PN} += "python310-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
