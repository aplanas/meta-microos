SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmidetect library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "libipmidetect0-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "8e525df0abfec70406a25a72add67156892a3dfddb45e4ca84ea6b7e809d078cd796e586c2f294b239fcd52d78d984bbf2f2833c8579ac797e3cec9444772b8a"

RPROVIDES:${PN} += "libipmidetect.so.0 \
libipmidetect0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
