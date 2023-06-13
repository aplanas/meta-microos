SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmiconsole library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "libipmiconsole2-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "9c70b49d6f3fccb98dc7c112598fb205a089b4e5b101e3eba919c1ef464a34a69cbd117b4cee48f754c5b9303b788aa3f7988a471f14cf1d2709836df07ea7c8"

RPROVIDES:${PN} += "libipmiconsole.so.2()(64bit) \
libipmiconsole2 \
libipmiconsole2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreeipmi.so.17()(64bit)"

inherit rpm
