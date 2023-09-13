SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-nb-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "43e135f4fc1054c488f3585b088ee1915f8a9e2cb525fa80a107ef6232cb1861878c827ab4cafd9867707cc6a65ff8e24adf898e59cb1c8ff88b292ac382031e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
