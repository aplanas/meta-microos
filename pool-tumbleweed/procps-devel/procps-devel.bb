SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-devel-3.3.17-14.1.aarch64.rpm"
RPM_HASH = "f8e71a13a6e98ce31aa9da588fdc850419a3e7374e7d28e478aec007d7adb8be036d23ab2e6105e83ab4d0708cc8dae35761e4544bd7b7e6d26f65aca8bb9cc8"

RPROVIDES:${PN} += "pkgconfig-libprocps \
procps-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprocps8"

inherit rpm
