SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmidetect library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "libipmidetect0-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "619895a88bcbc430a5249ae887114f2247f0c608d914d5c99c8c885bcb0860916c61a6a0dc04a0bb73c6a297521c8539fb876bb5880647ad9144ea15dbc6ad24"

RPROVIDES:${PN} += "libipmidetect.so.0()(64bit) \
libipmidetect0 \
libipmidetect0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
