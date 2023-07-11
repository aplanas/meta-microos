SUMMARY = "Translations for package featherpad"
DESCRIPTION = "Provides translations for the 'featherpad' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "featherpad-lang-1.4.1-1.1.noarch.rpm"
RPM_HASH = "d1ee6e041c2c47f8c302a205735aa115872d8624789a2cc349e344995e773ff320ecaf97e3790d631de218e528e4b46346b58e3a132e31e1bc9f718f54786c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "featherpad-lang \
featherpad-lang-all"

RDEPENDS:${PN} += "featherpad"

inherit rpm
