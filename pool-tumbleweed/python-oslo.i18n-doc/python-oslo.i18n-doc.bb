SUMMARY = "Documentation for OpenStack i18n library"
DESCRIPTION = "Documentation for the oslo.i18n library."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python-oslo.i18n-doc-6.0.0-1.2.noarch.rpm"
RPM_HASH = "ea2a598763420440c925298a080e85af7de2457b09fe815402a13c5d281aa93ee174906f0be527227dcc21fc923985679445c5b891b2a757853830c2c101378f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.i18n-doc"

RDEPENDS:${PN} += ""

inherit rpm
