SUMMARY = "KDE Internet"
DESCRIPTION = "KDE Internet Applications"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_internet-20230801-1.1.noarch.rpm"
RPM_HASH = "2e1a0d81ca149ac3a836825cb385000e586940495bcbd28dffda39c66b2de730ccf781a90ec49559ee5732f29d060b9483287d236c524e173f5d2abddfdb39cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-internet \
patterns-openSUSE-kde-internet \
patterns-openSUSE-kde4-internet"

RDEPENDS:${PN} += ""

inherit rpm
