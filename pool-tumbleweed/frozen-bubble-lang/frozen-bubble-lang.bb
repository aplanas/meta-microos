SUMMARY = "Translations for package frozen-bubble"
DESCRIPTION = "Provides translations for the 'frozen-bubble' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-lang-2.212-15.5.noarch.rpm"
RPM_HASH = "401eff0bad3991617df2ce51171fc59b7e4af21de4602f659038b77f29175a47ddedde55633d7254ade7c359a77b33ffc68f7abd4cea919b63b3198b51de3ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frozen-bubble-lang \
frozen-bubble-lang-all"

RDEPENDS:${PN} += "frozen-bubble"

inherit rpm
