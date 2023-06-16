SUMMARY = "Generate sentences in the style of 'Amici miei'"
DESCRIPTION = "This package is an italian blind text generator that ouputs \
supercazzole, mocking nonsense phrases from the movie series \
Amici Miei ('My friends'), directed by Mario Monicelli."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.1svn55250"

RPM_NAME = "texlive-antanilipsum-2023.201.0.0.8.1svn55250-54.1.noarch.rpm"
RPM_HASH = "f2489e0deaa2e0ace12f84464be9722aa8a69f215b0c6bb1f20a299e54a32b564c906afdfabb95018b5a9523cf3634829bce141d3d3dad2d230b262893790baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antanilipsum.sty \
texlive-antanilipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
