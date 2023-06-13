SUMMARY = "Translations for package featherpad"
DESCRIPTION = "Provides translations for the 'featherpad' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "featherpad-lang-1.4.0-1.1.noarch.rpm"
RPM_HASH = "b9b720ab9e1600a4b9d9720b25dbcca9edc348f1b5a64a47b83b514219860b28de991cd96de78202b1701dc460d75917e5b6f918450c1729376540f98df56dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "featherpad-lang \
featherpad-lang-all"

RDEPENDS:${PN} += "featherpad"

inherit rpm
