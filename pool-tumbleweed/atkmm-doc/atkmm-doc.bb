SUMMARY = "C++ Binding for the ATK library -- Documentation"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the documentation files for the ATK library's \
C++ bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "atkmm-doc-2.36.2-2.4.noarch.rpm"
RPM_HASH = "0e615616282cc45eed275390b71d88959f745f4cbf841f7fc475e2c053a82e1d7e2bd67745236f50c9834cc393e59d57f16138b01e4e989838c353af3b2052a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atkmm-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
