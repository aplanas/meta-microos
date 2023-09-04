SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-devel-298-1.1.aarch64.rpm"
RPM_HASH = "f43fc12db42f95a24f5737ea9fb74bc7c9bf36bea482884667069f1168c45cff8d6ab4c27e3530df4143192d72e1355e8778272b447897749c7583e4d7186dcd"

RPROVIDES:${PN} += "cockpit-devel"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
