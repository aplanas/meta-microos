SUMMARY = "Macros for 'Progress of Theoretical Physics'"
DESCRIPTION = "The distribution contains the class (which offers an option \
file for preprints), and a template. The class requires the \
cite, overcite and wrapfig packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-2023.201.0.0.91svn19440-53.1.noarch.rpm"
RPM_HASH = "58242002b94a2a9b55bc502e6517a2d1cda147103505eced19cd948ad75029302b13078285b3f35aaa08a3d40d1f09428a776a7fd363f04d6d1f14409bd9191c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ptp-prep.clo) \
tex(ptptex.cls) \
tex(wrapft.sty) \
texlive-ptptex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(overcite.sty) \
tex(wrapfig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
