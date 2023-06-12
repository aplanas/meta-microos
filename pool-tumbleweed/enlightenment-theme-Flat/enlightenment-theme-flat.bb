SUMMARY = "Default Enlightenment theme(Flat)"
DESCRIPTION = "The default theme for enlightenment install when using openSUSE branding."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-Flat-0.21.0-30.6.aarch64.rpm"
RPM_HASH = "b37fe74f380cf2cf6714776a7891a86910287f2aac60f57f8f6076defc3d24b6ad196b34e2773d5e16d87eaa5a1505d2da4498d39339a4f01f26a94d139f4a6d"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-Flat \
enlightenment-theme-Flat(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
