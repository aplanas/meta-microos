SUMMARY = "KDE Games"
DESCRIPTION = "KDE Applications - Games"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_games-20230403-1.1.noarch.rpm"
RPM_HASH = "2f22bd232a14691c18be64ba511a9dab9150bea4b543620330dcdea50dddfefb599585857235b82f09137dfbc437a3e1f0bd3496e7bad80da01cf5c2e08014f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_games \
patterns-openSUSE-kde4_games \
patterns-openSUSE-kde_games"

RDEPENDS:${PN} += ""

inherit rpm
