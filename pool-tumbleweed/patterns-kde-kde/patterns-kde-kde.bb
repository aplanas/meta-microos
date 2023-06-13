SUMMARY = "KDE Applications and Plasma 5 Desktop"
DESCRIPTION = "Packages providing the Plasma desktop environment and applications from KDE."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde-20230403-1.1.noarch.rpm"
RPM_HASH = "79e8a083074be042bbba435a594ff8d04313ccea1fe4bff75e946e82661d5e336c15b1c0673add8e1ca0a5d4dff10ade4f4a0a708f8da9fba6a4014ecf95873f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-kde-kde \
patterns-openSUSE-kde \
patterns-openSUSE-kde4"

RDEPENDS:${PN} += "pattern()"

inherit rpm
