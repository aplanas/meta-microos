SUMMARY = "Thesis presentations using beamer"
DESCRIPTION = "The package specifies a beamer theme for presenting a thesis."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn27539"

RPM_NAME = "texlive-beamer2thesis-2023.201.2.2svn27539-53.1.noarch.rpm"
RPM_HASH = "acc1db588d888b1726fe28a5b12b527770be554b89333603d7866077c3eaefd2373d6dd07d3c7b2022cfd037da5238d60e746575c08f192f3c3cc3506bc4634f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemetorinoth.sty) \
tex(beamerfontthemetorinoth.sty) \
tex(beamerinnerthemetorinoth.sty) \
tex(beamerouterthemetorinoth.sty) \
tex(beamerthemeTorinoTh.sty) \
texlive-beamer2thesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(fontspec.sty) \
tex(ifxetex.sty) \
tex(inputenc.sty) \
tex(metalogo.sty) \
tex(pifont.sty) \
tex(polyglossia.sty) \
tex(xkeyval.sty) \
tex(xltxtra.sty) \
tex(xunicode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
