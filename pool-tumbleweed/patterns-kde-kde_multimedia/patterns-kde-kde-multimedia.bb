SUMMARY = "KDE Multimedia"
DESCRIPTION = "KDE Applications - Multimedia"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_multimedia-20230801-1.1.noarch.rpm"
RPM_HASH = "768e753131b4370867fbdca5af40a46d61363caa3ea182353dfc3f595e3537a3b53f07e016e742e0babad67814bf5c467ea7c56ef346dcf78703c8f2dacbd4cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-multimedia \
patterns-openSUSE-kde-multimedia \
patterns-openSUSE-kde4-multimedia"

RDEPENDS:${PN} += ""

inherit rpm
