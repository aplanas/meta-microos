SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "6bb916430a12ad2015908336bfb902c6be4049676ca8b4a6afbb820999b88f87f63c2eb1a2392fdb81ad4e2d6cf4e6d44fa7410a064e2dfd417df5c88554642e"

RPROVIDES:${PN} += "calligra-devel calligra-devel(aarch-64)"
RDEPENDS:${PN} += "calligra"

inherit rpm
