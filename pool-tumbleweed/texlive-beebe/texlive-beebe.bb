SUMMARY = "A collection of bibliographies"
DESCRIPTION = "A collection of BibTeX bibliographies on TeX-related topics \
(including, for example, spell-checking and SGML). Each \
includes a LaTeX wrapper file to typeset the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66286"

RPM_NAME = "texlive-beebe-2023.209.svn66286-54.1.noarch.rpm"
RPM_HASH = "a3346e7ca49380063c37a61ce5206e3880a17e894b5e400b91e1308579c8a42ea1dd3e83fb586caf0d60cec596e3aa437d675d699023244dc48ac055e988363c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibnames.sty \
tex-texnames.sty \
tex-tugboat.def \
texlive-beebe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
