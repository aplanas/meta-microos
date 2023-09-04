SUMMARY = "Create handout for auditors of a talk"
DESCRIPTION = "In some fields of scholarship, a beamer does not offer good \
support when giving a talk in a proceeding. For example, in \
classical philology, the main sources are text, and it will be \
better to distribute a handout to the audience with extracts of \
the texts about which we will talk. The package supports \
preparation of such handouts when writing the talk."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.0svn43962"

RPM_NAME = "texlive-handout-2023.209.1.6.0svn43962-54.2.noarch.rpm"
RPM_HASH = "a70fb9e6654d5a6ae041cb329a2a20d0dce112463b0de95b53fcfe242bdedc7a88b59b4a0cd8bbba85182e65fb50dd54c70730051d5c7d4f2f6620adb509e403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handout.sty \
texlive-handout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
