SUMMARY = "Development files for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files.  libmsi in turn is a port of (and a subset of) Wine's \
implementation of the Windows Installer. \
 \
msitools can be used for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "msitools-devel-0.102-1.1.aarch64.rpm"
RPM_HASH = "44759370926dca2a93ef6ce1884f8752f6310d55168591c6715d99b7dfef3b58cf8a3a4e65a65713788588d802acd74f9a7fdee7331b6cb8d43608a3a7da9a38"

RPROVIDES:${PN} += "msitools-devel \
pkgconfig-libmsi-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsi0 \
msitools \
pkgconfig-gio-2.0 \
typelib-1-0-Libmsi-1-0"

inherit rpm
