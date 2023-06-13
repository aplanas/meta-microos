SUMMARY = "Translations for package nitrogen"
DESCRIPTION = "Provides translations for the 'nitrogen' package."
LICENSE = "GPL-2.0-only & CC-BY-SA-3.0"

PV = "1.6.1"

RPM_NAME = "nitrogen-lang-1.6.1-1.22.noarch.rpm"
RPM_HASH = "7afc5bfe46c07ff610c91c8d32e6db4829f9721065a8e8b2902c5e1960f03a01ffc7a47c1145d800310813620f3f3adc5823eecfa02de98df66dff9d35e8d2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nitrogen:bs) \
locale(nitrogen:fi) \
locale(nitrogen:hr) \
locale(nitrogen:pl) \
locale(nitrogen:ru) \
locale(nitrogen:sr) \
nitrogen-lang \
nitrogen-lang-all"

RDEPENDS:${PN} += "nitrogen"

inherit rpm
