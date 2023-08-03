SUMMARY = "Generate sentences in the style of 'Amici miei'"
DESCRIPTION = "This package is an italian blind text generator that ouputs \
supercazzole, mocking nonsense phrases from the movie series \
Amici Miei ('My friends'), directed by Mario Monicelli."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.1svn55250"

RPM_NAME = "texlive-antanilipsum-2023.209.0.0.8.1svn55250-55.1.noarch.rpm"
RPM_HASH = "f61da1b375c0dd52e136f0fd0f1bd3f84653cfbe42417366f1bca45216e89f14e181c66e6d91005619d8bd091947b440ede2a95ea6b3bec7f4bbeba22410571f"
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
