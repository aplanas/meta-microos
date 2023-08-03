SUMMARY = "Thesis presentations using beamer"
DESCRIPTION = "The package specifies a beamer theme for presenting a thesis."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn27539"

RPM_NAME = "texlive-beamer2thesis-2023.209.2.2svn27539-54.1.noarch.rpm"
RPM_HASH = "61d7fe26ec769730c2a1313a01736503fea7b44b87a2bd0ece6c9e2b64c463c6f31ac137a9820f62ca4ac59df0937e803d1ba2bd4bfec8d81ed56a4ca90029da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemetorinoth.sty \
tex-beamerfontthemetorinoth.sty \
tex-beamerinnerthemetorinoth.sty \
tex-beamerouterthemetorinoth.sty \
tex-beamerthemeTorinoTh.sty \
texlive-beamer2thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-metalogo.sty \
tex-pifont.sty \
tex-polyglossia.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
