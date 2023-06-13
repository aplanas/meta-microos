SUMMARY = "Extract solutions from exercises and quizzes"
DESCRIPTION = "This package is designed to mark a solution environment of an \
exercise or quiz and insert it into the same or a different \
document. Solutions are ones created by either the exerquiz or \
eqexam package. All PDF creators are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-2023.201.0.0.6svn49651-54.1.noarch.rpm"
RPM_HASH = "9a850780af3e1e668b7ee6f94099c600a2db6849cd498965ab86a92ef44c0a4cf62f4f42edbac27d30bf6e54b824f23945847f4a1d5478088d326f8474fcc18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mi-solns.sty) \
texlive-mi-solns"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(shellesc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
