SUMMARY = "BibLaTeX style for the Oxford Standard for the Citation of Legal Authorities"
DESCRIPTION = "The package provides a set of style files for use with BibLaTeX \
(v 2+) and Biber (v 1+) to produce citations and bibliographies \
in accordance with the widely-used Oxford Standard for the \
Citation of Legal Authorities. It also includes facilities for \
constructing tables of cases and legislation from citations (in \
conjunction with appropriate indexing packages)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn54328"

RPM_NAME = "texlive-oscola-2023.201.1.7svn54328-54.1.noarch.rpm"
RPM_HASH = "d85b566ba7b1e8bf987cf29132a418fa0137aebf6b141f22a2a0634b073b05aff3465c27459f777c256077a32a39b7f2c78947d9b57fcfc642ed5c4f99c2081a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-oscola.lbx \
tex-british-oscola.lbx \
tex-english-oscola.lbx \
tex-oscola.bbx \
tex-oscola.cbx \
texlive-oscola"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-verbose-inote.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
