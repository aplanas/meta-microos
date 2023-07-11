SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-devel-4.0.3-1.4.aarch64.rpm"
RPM_HASH = "8869b93f61a47890e92665a906304d31e1ef67a064148c9481d0b60f6b9bbc975129dcbf526147edc95cd81668b0f0676282f91ece7672ece15de347d7951beb"

RPROVIDES:${PN} += "pkgconfig-libproc2 \
procps4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproc2-0"

inherit rpm
