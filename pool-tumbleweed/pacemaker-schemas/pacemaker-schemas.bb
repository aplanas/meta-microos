SUMMARY = "Schemas and upgrade stylesheets for Pacemaker"
DESCRIPTION = "Schemas and upgrade stylesheets for Pacemaker \
 \
Pacemaker is an advanced, scalable High-Availability cluster resource \
manager"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-schemas-2.1.6+20230524.6fdc9deea-1.1.noarch.rpm"
RPM_HASH = "8b23eb875850b2410f1fccd9a99c612c16eb4df60574dc2e4409f0dbc1cbd98da9d4b251f790568b3942d01a6bfad2e381ca5392e5e854371a7565728933d534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-schemas \
pkgconfig-pacemaker-schemas"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
