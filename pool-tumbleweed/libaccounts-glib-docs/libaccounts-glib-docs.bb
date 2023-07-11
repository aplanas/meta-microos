SUMMARY = "Documentation for libaccounts-glib"
DESCRIPTION = "This package contains the documentation for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-docs-1.26-1.4.noarch.rpm"
RPM_HASH = "a57584b1ed126231657673539447b19e0b97c43362cf692cee343c04d83c94086b924a4334e78ad68d536a2e38f67b6207bf204c7a217aaec8cd1a2878a0b2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-glib-docs"

RDEPENDS:${PN} += ""

inherit rpm
