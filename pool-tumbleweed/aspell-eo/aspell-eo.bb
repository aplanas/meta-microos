SUMMARY = "Esperanto Dictionary for Aspell"
DESCRIPTION = "An Esperanto dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.20000225"

RPM_NAME = "aspell-eo-2.1.20000225-2.14.aarch64.rpm"
RPM_HASH = "c5aa34244f02c9d22fc2fa652fa2eaff8673f6b31635e3446173ac76cda5b5ebc526c3bd5450ee0bceef52c64e175796387b735dad84645e1d2e033bf364f3a8"

RPROVIDES:${PN} += "aspell-eo \
locale-aspell-eo"

RDEPENDS:${PN} += ""

inherit rpm
