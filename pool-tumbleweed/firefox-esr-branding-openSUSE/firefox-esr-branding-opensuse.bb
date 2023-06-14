SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "firefox-esr-branding-openSUSE-68-4.1.aarch64.rpm"
RPM_HASH = "d3219b14e5d09a3d1ec72117ab962a10c8fe0ef2d280f3d5f5d014d04fb262c2cf72e3ebd002386bb68d3ecaed4ec8e2f46d4289d5166f5891961f16cd1da9d1"

RPROVIDES:${PN} += "firefox-esr-branding \
firefox-esr-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
