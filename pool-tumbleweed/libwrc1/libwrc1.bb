SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc1-20230318-1.2.aarch64.rpm"
RPM_HASH = "de80acdd5ea7359522b01bc7f57538ab77133ba00f0a155388385d80cec152e7593351799b42c0155b0a155dd484df09290553b9db81ffa54691c5f3b0a4cbef"

RPROVIDES:${PN} += "libwrc.so.1 \
libwrc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
