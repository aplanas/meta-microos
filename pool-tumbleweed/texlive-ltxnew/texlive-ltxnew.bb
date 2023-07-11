SUMMARY = "A simple means of creating commands"
DESCRIPTION = "The package ltxnew provides \\new, \\renew and \\provide prefixes \
for checking definitions. It is designed to work with e-TeX \
distributions of LaTeX and relies on the LaTeX internal macro \
\\@ifdefinable. Local allocation of counters, dimensions, skips, \
muskips, boxes, tokens and marks are provided by the etex \
package. \\new and \\renew as well as \\provide may be used for \
all kind of control sequences. Please refer to the section \
'Using \\new' of the PDF documentation."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3svn21586"

RPM_NAME = "texlive-ltxnew-2023.208.1.3svn21586-53.1.noarch.rpm"
RPM_HASH = "bd1c7554247f4aa3fa89bc716bd87d9713c688bbd954ee0cfc34b97e88cda8c0bf739df54e81999916cbc2189024251d06a9729a4137787a6c804910960c9723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxnew.sty \
texlive-ltxnew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
