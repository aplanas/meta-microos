SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The leipzig package provides a set of macros for standard \
glossing abbreviations, with options to create new ones. They \
are mnemonic (e.g. \\Acc{} for accusative, abbreviated acc). \
These abbre can be used alone or on top of the glossaries \
package for easy indexing and glossary printing."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn52450"

RPM_NAME = "texlive-leipzig-2023.209.2.3svn52450-55.1.noarch.rpm"
RPM_HASH = "407c53787ffedc342bdd1032e585d31c2d35ce231965e0d05706c6c3d0dfd97b45d843b8b22f286c3da5f61ec629c934c92df7d4a7c88178e48b1ae49118d985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leipzig.sty \
tex-leipzig.tex \
texlive-leipzig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-glossaries.sty \
tex-glossary-inline.sty \
tex-glossary-mcols.sty \
tex-glossary-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
