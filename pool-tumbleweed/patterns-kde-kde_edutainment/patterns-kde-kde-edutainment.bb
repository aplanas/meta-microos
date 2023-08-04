SUMMARY = "KDE Education"
DESCRIPTION = "KDE Applications - Tools to teach kids with computers"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_edutainment-20230801-1.1.noarch.rpm"
RPM_HASH = "0a30426bf4713df50a4d642c7fa56aa6daf5d0961a9090b14a1da68435bc36ac4246d14308f2d72f2d32cf844fa323b6b3830466a41548fb84c430cf81a8c550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-edutainment \
patterns-openSUSE-kde-edutainment \
patterns-openSUSE-kde4-edutainment"

RDEPENDS:${PN} += ""

inherit rpm
