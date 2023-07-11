SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "f3514826bc9f0dbc9a98c0c355eb8e44e31015ff7bf0a25546dbace162b696693f00fdc0466c0cabfa5859d9100bb33f7f3d9d952608b8bd6a02828f08ace1dc"

RPROVIDES:${PN} += "calligra-devel"

RDEPENDS:${PN} += "calligra"

inherit rpm
