SUMMARY = "KDE Frameworks and Plasma Development"
DESCRIPTION = "KDE Frameworks development packages."
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-devel_kde_frameworks-20230801-1.1.noarch.rpm"
RPM_HASH = "c939eaaf9443dfa5cc905914ff755b0d44262d7e27a05d4284a7065ef1f5c4a694bbcac806c8c6c1e159c149681294c7051f0bbee668e6b960f953c075a2db59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-kde \
patterns-kde-devel-kde-frameworks \
patterns-openSUSE-devel-kde \
patterns-openSUSE-devel-kde-framework"

RDEPENDS:${PN} += "pattern-"

inherit rpm
