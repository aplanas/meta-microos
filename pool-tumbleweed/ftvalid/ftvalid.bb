SUMMARY = "Layout table validator"
DESCRIPTION = "Layout table validator \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftvalid-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "6febf847b33722704e06d39bd2c4fce1e05440cb830eeb1d989ccfc6854d76db647a1b34fc73188f3b5ce0a548b1ad95f2b085903605ceb5c833f6defc280d9f"

RPROVIDES:${PN} += "ftvalid \
ftvalid(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit)"

inherit rpm
