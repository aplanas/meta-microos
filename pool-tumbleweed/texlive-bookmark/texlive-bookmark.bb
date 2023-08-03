SUMMARY = "A new bookmark (outline) organization for hyperref"
DESCRIPTION = "This package implements a new bookmark (outline) organization \
for package hyperref. Bookmark properties such as style and \
color can now be set. Other action types are available (URI, \
GoToR, Named). The bookmarks are generated in the first compile \
run. Package hyperref uses two runs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.29svn56885"

RPM_NAME = "texlive-bookmark-2023.209.1.29svn56885-53.1.noarch.rpm"
RPM_HASH = "0181fa270c5cdaaa8f8a3f9a862637cf3ae0f29290c5c02412dc802103f5382e07f17d48758fc1c865a3b632002ca98f956c796fb25b50fff717a6ca0f85eb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bkm-dvipdfm-2019-12-03.def \
tex-bkm-dvipdfm.def \
tex-bkm-dvips-2019-12-03.def \
tex-bkm-dvips.def \
tex-bkm-pdftex-2019-12-03.def \
tex-bkm-pdftex.def \
tex-bkm-vtex-2019-12-03.def \
tex-bkm-vtex.def \
tex-bookmark.sty \
texlive-bookmark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atenddvi.sty \
tex-atveryend.sty \
tex-auxhook.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
