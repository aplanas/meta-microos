SUMMARY = "C++ Binding for the ATK library -- Development Files"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides all the necessary files for development with ATK \
library's C++ bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "atkmm-devel-2.36.2-2.4.aarch64.rpm"
RPM_HASH = "e2a81f81a94bad795c8b7ef47d64c2758727f898a7d6925492a217c78a820ae1005afae5458ed0da0ba774ec5f1ec0315d29f5083d7bac7a038188cc3e094c01"

RPROVIDES:${PN} += "atkmm-devel \
pkgconfig-atkmm-2.36"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatkmm-2-36-1 \
pkgconfig-atk \
pkgconfig-glibmm-2.68"

inherit rpm
