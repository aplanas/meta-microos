SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "1711a6534b544f9e8fe33e7658710bedb2b019332ae2c3a756dea85ece81ea9c76a6572eeebc557cb3870b13cf39a8a44774fcc1bfc7d1acb57f93dbf1110387"

RPROVIDES:${PN} += "calligra-devel"

RDEPENDS:${PN} += "calligra"

inherit rpm
