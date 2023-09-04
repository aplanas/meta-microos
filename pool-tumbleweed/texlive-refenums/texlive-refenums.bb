SUMMARY = "Define named items and provide back-references with that name"
DESCRIPTION = "The package provides commands to define enumerable items with a \
number and a long name, which can be referenced later with the \
name or just the short form. For instance, 'Milestone M1: \
Specification created' can be defined and later on be \
referenced with 'M1' or 'M1 ('Specification created')'. The \
text in the references is derived from the definition and also \
rendered as hyperlink to the definition."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn44131"

RPM_NAME = "texlive-refenums-2023.209.1.1.2svn44131-54.2.noarch.rpm"
RPM_HASH = "a2c5449645ed7ddb98fc38db51b22fb451fd113235cfa543c853f6ee8ce423f3eb30e1382ee4c67d06d638faa3fb73aa3e428d635efad30509dfac146279eddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refenums.sty \
texlive-refenums"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-csquotes.sty \
tex-hyperref.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
