SUMMARY = "Translations for package deepin-start"
DESCRIPTION = "Provides translations for the 'deepin-start' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-lang-5.9.49-2.3.aarch64.rpm"
RPM_HASH = "c22b4a8fa9dd526534b3c021eeafb928255662b43c8313a2e2bf34024657dba2d405244a2d5b972709384949a9bbc81785382ce2dcc931c098a6b97c0d2b317a"

RPROVIDES:${PN} += "deepin-start-lang deepin-start-lang(aarch-64)"
RDEPENDS:${PN} += "deepin-start"

inherit rpm
