SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python311-libwrc-20230318-2.1.aarch64.rpm"
RPM_HASH = "a99a269e94d0012a628d6e73f617935f14127378946227d582acaed51c9e34f600ab92364fdeecbcc28f895742c7b152d4df27f5ef043e9f44020777c75436c1"

RPROVIDES:${PN} += "python3-libwrc \
python311-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
