SUMMARY = "Create handout for auditors of a talk"
DESCRIPTION = "In some fields of scholarship, a beamer does not offer good \
support when giving a talk in a proceeding. For example, in \
classical philology, the main sources are text, and it will be \
better to distribute a handout to the audience with extracts of \
the texts about which we will talk. The package supports \
preparation of such handouts when writing the talk."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.0svn43962"

RPM_NAME = "texlive-handout-2023.201.1.6.0svn43962-53.1.noarch.rpm"
RPM_HASH = "35cc938179f218f8b5ca758367426a789ab5d45ef0a5fe8064e682979929ae1c6fe2e0813aacf37a99265abda60a4ebd80e12741028dd10aa142566b3b39ca61"
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
