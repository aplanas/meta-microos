SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.8"

RPM_NAME = "gsequencer-devel-doc-6.0.8-1.1.noarch.rpm"
RPM_HASH = "92c359c3f1ac6bae0769239d451bc8686663fdac813752f79a9f1949036cc78a09332c65e2fce17aff2eb789cd70ecabce229faaa5cac1685c05e71ee4285427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
