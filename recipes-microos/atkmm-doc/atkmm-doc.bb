SUMMARY = "C++ Binding for the ATK library -- Documentation"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the documentation files for the ATK library's \
C++ bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "atkmm-doc-2.36.2-2.3.noarch.rpm"
RPM_HASH = "226e3bbd1b175e38a275fc62c7d520fa48422eebe12fab2bd6868013dc77a598770d39a3a3eec0f15909ad0a258ae5ebc157ee6ef740d6b999e18b0475f4fb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atkmm-doc"
RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
