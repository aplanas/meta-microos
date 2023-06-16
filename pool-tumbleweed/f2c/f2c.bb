SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-20210928-1.3.aarch64.rpm"
RPM_HASH = "3b47901123b3f69493c268d943a9102ee92adceec5f880010f3830f78e73583b7e34dcc7f51e49025b8120e3539eae4a96c6165ace30400f119368dcb90d0161"

RPROVIDES:${PN} += "f2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
