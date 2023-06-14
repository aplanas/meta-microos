SUMMARY = "Development files for gtk2-engines"
DESCRIPTION = "This package contains development files for gtk2-engines."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-devel-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "c133796eea0e5a5ea9bb66e43e1a9b61d79cf9620b5e454330d483ac4b55ebac588ff0ce429bde1cd6d109e843981d91af955de9782f7fb1a1d1f305d61d6e82"

RPROVIDES:${PN} += "gtk2-engines-devel \
pkgconfig-gtk-engines-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-engines \
pkgconfig-gtk+-2.0"

inherit rpm
