SUMMARY = "C++ Binding for the ATK library -- Development Files"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides all the necessary files for development with ATK \
library's C++ bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "atkmm-devel-2.36.2-2.3.aarch64.rpm"
RPM_HASH = "748b41486ed49a302ea7477b47a6757f6a7d40f1fdcde67b256671b535c80ca36b4746c6b5c8716aca2401666147e66e0bab13b16b6d1e17feb1687b9a170f08"

RPROVIDES:${PN} += "atkmm-devel \
atkmm-devel(aarch-64) \
pkgconfig(atkmm-2.36)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatkmm-2_36-1 \
pkgconfig(atk) \
pkgconfig(glibmm-2.68)"

inherit rpm
