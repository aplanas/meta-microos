SUMMARY = "Translations for package goldendict-ng"
DESCRIPTION = "Provides translations for the 'goldendict-ng' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.05.03"

RPM_NAME = "goldendict-ng-lang-23.05.03-3.1.noarch.rpm"
RPM_HASH = "f968742955c876100d2bf73d509315a0a2f160dc035e26f1f303485e2568ff6a1561d7662e73ffb7870590c321ca12093ea4d2858564c7304b14856acfff8005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goldendict-ng-lang \
goldendict-ng-lang-all"

RDEPENDS:${PN} += "goldendict-ng"

inherit rpm
