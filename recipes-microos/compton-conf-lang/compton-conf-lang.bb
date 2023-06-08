SUMMARY = "Translations for package compton-conf"
DESCRIPTION = "Provides translations for the 'compton-conf' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "compton-conf-lang-0.16.0-2.9.noarch.rpm"
RPM_HASH = "3a0047c29c3173db9c878b6907ad9a65e86f27305a9817b40938f92eaf6b1b65e9d32668b85aae8e5534d659b96d76a4a6e9675f628bd1b6b666552fef68fbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compton-conf-lang compton-conf-lang-all"
RDEPENDS:${PN} += "compton-conf"

inherit rpm
