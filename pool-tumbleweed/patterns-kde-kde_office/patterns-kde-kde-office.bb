SUMMARY = "KDE Office"
DESCRIPTION = "KDE Office"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_office-20230801-1.1.noarch.rpm"
RPM_HASH = "ce54ddb8cd0227efe401463ba3685a4c627c58699267e91eb597ce36df4aafed8fda652b2af39e3a62dd1c3ef7707b342b6422eee70414600826413f953584a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-office \
patterns-openSUSE-kde-office \
patterns-openSUSE-kde4-office"

RDEPENDS:${PN} += ""

inherit rpm
