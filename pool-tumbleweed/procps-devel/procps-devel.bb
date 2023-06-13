SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-devel-3.3.17-12.3.aarch64.rpm"
RPM_HASH = "fca67e853272c5b52f9d47d93c5f6e643dec75a3311303431c7ea4fa0d9faf462337d854c369d74f15c03ebb30891152fab8fdee1bef3c3f93aed8182c898794"

RPROVIDES:${PN} += "pkgconfig(libprocps) \
procps-devel \
procps-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprocps8"

inherit rpm
