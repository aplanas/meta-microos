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

PV = "2023.201.1.3svn21586"

RPM_NAME = "texlive-ltxnew-2023.201.1.3svn21586-52.1.noarch.rpm"
RPM_HASH = "dc2b7b0ace0744b34c1533540e5dd868cf8816e87fba4782f31a67bd90669e65d91be649ba318810fbbf8a3a2d262d6fd3b992d606b1ef200baf0c47108380fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxnew.sty \
texlive-ltxnew"

RDEPENDS:${PN} += "/bin/sh \
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
