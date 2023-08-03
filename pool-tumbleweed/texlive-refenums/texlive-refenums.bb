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

RPM_NAME = "texlive-refenums-2023.209.1.1.2svn44131-54.1.noarch.rpm"
RPM_HASH = "534f6fae4919e8f601f74c43633c4de0e64ac7fcfc76392d581f2cdad4f5d4cb8e25ef6b1b76ae63405912dcbe8c6f499ba81fd27237292ec9c52ebc7bcc76c0"
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
