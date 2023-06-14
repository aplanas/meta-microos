SUMMARY = "Translations for package quilter"
DESCRIPTION = "Provides translations for the 'quilter' package."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "quilter-lang-3.3.4-1.11.noarch.rpm"
RPM_HASH = "fddadda96a051a94fcf24300584eecaa293b554a8dc30c8111ea6e96b203bafb06a013dedd97219a098c49819c4518b235159922f34163ea64b3c6794bcf9e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-quilter-ca \
locale-quilter-da \
locale-quilter-de \
locale-quilter-eo \
locale-quilter-es \
locale-quilter-fr \
locale-quilter-it \
locale-quilter-ja \
locale-quilter-lt \
locale-quilter-nl \
locale-quilter-pl \
locale-quilter-pt-BR \
locale-quilter-ru \
quilter-lang \
quilter-lang-all"

RDEPENDS:${PN} += "quilter"

inherit rpm
