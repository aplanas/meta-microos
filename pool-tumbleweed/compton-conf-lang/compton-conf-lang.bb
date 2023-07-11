SUMMARY = "Translations for package compton-conf"
DESCRIPTION = "Provides translations for the 'compton-conf' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "compton-conf-lang-0.16.0-2.10.noarch.rpm"
RPM_HASH = "b1fd4f1c3310f155076ce97196c4cd85b39a0d9f4fb8f9d62cf4945ba9540ff223b89096ad3901921d76dc4319ee5b056a93260e52119e7082d6192bc6490825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compton-conf-lang \
compton-conf-lang-all"

RDEPENDS:${PN} += "compton-conf"

inherit rpm
