SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-20210928-2.1.aarch64.rpm"
RPM_HASH = "13c52f7d62f22d21576535cb0febe6364adf001d3cb9e56289fbc27a9518d980f8b2693de77815d7e663ebfd15eee9615d297d7b511b5e7ad3ae9e9f07297124"

RPROVIDES:${PN} += "f2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
