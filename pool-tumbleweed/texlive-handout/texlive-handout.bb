SUMMARY = "Create handout for auditors of a talk"
DESCRIPTION = "In some fields of scholarship, a beamer does not offer good \
support when giving a talk in a proceeding. For example, in \
classical philology, the main sources are text, and it will be \
better to distribute a handout to the audience with extracts of \
the texts about which we will talk. The package supports \
preparation of such handouts when writing the talk."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.0svn43962"

RPM_NAME = "texlive-handout-2023.209.1.6.0svn43962-54.1.noarch.rpm"
RPM_HASH = "c174c990f37de67d3a531b624cc6efef1cabf037b4c2f9b2429dc2b27fc595c1df17ec3ed2c21b80aaa016ce99e2b25840b1fdfe9999bc093d168de3140d88fa"
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
