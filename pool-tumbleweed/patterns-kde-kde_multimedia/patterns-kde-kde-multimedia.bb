SUMMARY = "KDE Multimedia"
DESCRIPTION = "KDE Applications - Multimedia"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_multimedia-20230403-1.1.noarch.rpm"
RPM_HASH = "967e1bc6d6b6d7ce940fbfb7a6dbd18c585a88ed515700ede98cc52b3fb6140d8511c1b76c57eedf017915ef0a1f40044c9574456ee832ab4ef31dbbc1c04fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_multimedia \
patterns-openSUSE-kde4_multimedia \
patterns-openSUSE-kde_multimedia"

RDEPENDS:${PN} += ""

inherit rpm
