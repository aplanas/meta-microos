SUMMARY = "Extract solutions from exercises and quizzes"
DESCRIPTION = "This package is designed to mark a solution environment of an \
exercise or quiz and insert it into the same or a different \
document. Solutions are ones created by either the exerquiz or \
eqexam package. All PDF creators are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-2023.209.0.0.6svn49651-55.1.noarch.rpm"
RPM_HASH = "4c7420945c0b93386e72da6aa9ab62a2014ba85b3c90770cb358bfee8a4c913ef010441f26fed0c3eadccad5eb373ba8e197a17039f39407023514c8859876da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mi-solns.sty \
texlive-mi-solns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
