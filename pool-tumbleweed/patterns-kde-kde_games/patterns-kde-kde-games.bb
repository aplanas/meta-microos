SUMMARY = "KDE Games"
DESCRIPTION = "KDE Applications - Games"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_games-20230801-1.1.noarch.rpm"
RPM_HASH = "0d77c5fa10f51380114472f7a7b13fa3a9cff8b7aa64060e198ef83d07b3ef05e9f010e4362253c1d8de865bf02e22a3dacb574a30db1cde613be6c79f58e457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-games \
patterns-openSUSE-kde-games \
patterns-openSUSE-kde4-games"

RDEPENDS:${PN} += ""

inherit rpm
