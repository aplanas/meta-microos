SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to develop tests for a PAM module, you can use this library, \
which simplifies testing of modules. This subpackage includes the header \
files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest-devel-1.1.4-2.4.aarch64.rpm"
RPM_HASH = "e8a0bac586a43e1fed77784425ed8b51268e231063b6597e50f3d97e4e396f435c20cf7aefa41d9e9dd776324f046c299d498997913f45388397f9acaa597cf4"

RPROVIDES:${PN} += "cmake-pamtest \
libpamtest-devel \
pkgconfig-libpamtest"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpamtest0 \
pam-wrapper"

inherit rpm
