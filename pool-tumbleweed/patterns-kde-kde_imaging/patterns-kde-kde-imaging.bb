SUMMARY = "KDE Graphics"
DESCRIPTION = "KDE Applicatons - Handling of digital photos and graphics"
LICENSE = "MIT"

PV = "20230801"

RPM_NAME = "patterns-kde-kde_imaging-20230801-1.1.noarch.rpm"
RPM_HASH = "a82346a86c8594b0277a572acc846697540fd299e1d0db3f2e6f404bfe5c19c327ff938f60277db7f41e552131e07f10824b23b8e8c7de5c8c635ccdeacdca86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-imaging \
patterns-openSUSE-kde-imaging \
patterns-openSUSE-kde4-imaging"

RDEPENDS:${PN} += "pattern-"

inherit rpm
