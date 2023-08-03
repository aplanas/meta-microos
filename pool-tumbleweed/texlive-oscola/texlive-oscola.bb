SUMMARY = "BibLaTeX style for the Oxford Standard for the Citation of Legal Authorities"
DESCRIPTION = "The package provides a set of style files for use with BibLaTeX \
(v 2+) and Biber (v 1+) to produce citations and bibliographies \
in accordance with the widely-used Oxford Standard for the \
Citation of Legal Authorities. It also includes facilities for \
constructing tables of cases and legislation from citations (in \
conjunction with appropriate indexing packages)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn54328"

RPM_NAME = "texlive-oscola-2023.209.1.7svn54328-55.1.noarch.rpm"
RPM_HASH = "03f9ec8575a449a181aec54138838df80d9502e5528efc07bb1db18d99ff6b995113b2a6b3603fb6349e85a1c6218ca3ac5cd8cab024e3f5d33e06347cbeb7e2"
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
