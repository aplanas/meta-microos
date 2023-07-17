SUMMARY = "Tools to access Microsoft executable (EXE) format files"
DESCRIPTION = "Tools to access Microsoft executable (.exe) format files \
including PE/COFF formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-tools-20210424-4.10.aarch64.rpm"
RPM_HASH = "bf577b537a3462fae08fdc2afd9dc09de64c7a95e70bfe1652af4147a172f6113d0f5b9a8d34e57fd25626b78b8e818de427ffff5f0a44afc9e3979f3b6749d8"

RPROVIDES:${PN} += "libexe-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1"

inherit rpm
