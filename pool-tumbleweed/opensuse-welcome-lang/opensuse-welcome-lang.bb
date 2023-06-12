SUMMARY = "Translations for package opensuse-welcome"
DESCRIPTION = "Provides translations for the 'opensuse-welcome' package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.9+git.0.66be0d8"

RPM_NAME = "opensuse-welcome-lang-0.1.9+git.0.66be0d8-1.2.noarch.rpm"
RPM_HASH = "3fb5637d245f0611afea2b4e3685d23768f3c87382445e77265497a8e2324821ef175a670591f357d247d3695a79ed237f0e879be51c0ce0d2fe79e3cde398de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensuse-welcome-lang \
opensuse-welcome-lang-all"
RDEPENDS:${PN} += "opensuse-welcome"

inherit rpm
