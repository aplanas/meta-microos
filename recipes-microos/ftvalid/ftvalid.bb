SUMMARY = "Layout table validator"
DESCRIPTION = "Layout table validator \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftvalid-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "da3ac6c3965ad2906ea2f2b3fbdf3ca7cf8c5b529441f7ec2e578c4c7ebfd80c9aeded2429df83ead5399d8c218b2f9c3b28c5e07dbcdbe039b098ea4b2e37df"

RPROVIDES:${PN} += "ftvalid ftvalid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit)"

inherit rpm
