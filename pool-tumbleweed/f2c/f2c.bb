SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-20210928-1.4.aarch64.rpm"
RPM_HASH = "f450a4000e7cbaf87b52f061c0eb74de14d0e88440894759ec754a8093f6bc17c3e6b8b10f21825ffd72e2f89cf0c52868fff77553953cb6c85bc29a9dfda250"

RPROVIDES:${PN} += "f2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
