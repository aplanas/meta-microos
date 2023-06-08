SUMMARY = "Simple font dumper"
DESCRIPTION = "Simple font dumper \
This tool is part of the FreeType project"
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "ftdump-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "eff551e97891df6f455ea300ff9ebb182f95bc203d36cc0966f3bf299f277bf92e11ffdeb4b5a25587ea59f24bcfe319b9a071913397cb0eddd386dbddc1b15c"

RPROVIDES:${PN} += "ftdump ftdump(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit)"

inherit rpm
