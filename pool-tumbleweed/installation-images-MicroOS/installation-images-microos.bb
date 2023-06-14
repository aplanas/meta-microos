SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "installation-images-MicroOS-17.87-1.9.aarch64.rpm"
RPM_HASH = "485bdf52e5bfcfbb7f2bf633875ab9306678c10f695f06db2e4773eabd2bb5a25face0241636aaec7416a489356f93fa4377da6064f3bb30cd472f92ae086ded"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
