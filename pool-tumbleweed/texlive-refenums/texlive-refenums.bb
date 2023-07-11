SUMMARY = "Define named items and provide back-references with that name"
DESCRIPTION = "The package provides commands to define enumerable items with a \
number and a long name, which can be referenced later with the \
name or just the short form. For instance, 'Milestone M1: \
Specification created' can be defined and later on be \
referenced with 'M1' or 'M1 ('Specification created')'. The \
text in the references is derived from the definition and also \
rendered as hyperlink to the definition."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn44131"

RPM_NAME = "texlive-refenums-2023.201.1.1.2svn44131-53.2.noarch.rpm"
RPM_HASH = "f238a17c108b32bda1fd29fb0aadacdbdd11761f4bee4cff1ae7a5581e8d7b37a7c96b7887ce39ead971427646ebe3e5529e03b74eda3c2ea244081fdd8cd8b9"
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
