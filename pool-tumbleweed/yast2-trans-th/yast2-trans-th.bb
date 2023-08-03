SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-th-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "5e2e0d37cc1262c59b515ef3e0c9b870861c17bf6b1f1b4a8631caa22bb4f4afb50d594cd4521be18fdd1c3e3fc7accc2fa79d9bae2b078e0c15c57daeab285f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
