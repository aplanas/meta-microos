SUMMARY = "Development package for irssi"
DESCRIPTION = "This package contains the development files for irssi. It allows to \
compile plugins for the irssi package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-devel-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "bc660f8ff93f393526580b69da42af6a52ebf911aca098ac6d84182abc8e8e7bed915028e01deb4410c05113202053ccf41e2f88d5f2845305d25af035bead14"

RPROVIDES:${PN} += "irssi-devel \
pkgconfig-irssi-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dante-devel \
irssi \
pkgconfig-glib-2.0"

inherit rpm
