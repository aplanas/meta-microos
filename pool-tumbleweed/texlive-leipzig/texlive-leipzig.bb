SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The leipzig package provides a set of macros for standard \
glossing abbreviations, with options to create new ones. They \
are mnemonic (e.g. \\Acc{} for accusative, abbreviated acc). \
These abbre can be used alone or on top of the glossaries \
package for easy indexing and glossary printing."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn52450"

RPM_NAME = "texlive-leipzig-2023.201.2.3svn52450-54.1.noarch.rpm"
RPM_HASH = "651d4804b38f980840141376f6e4963600d8f4e2b7f17edc7bb69e27d510ddfc7a837c01962004c060e9d9b64ccd4c97d18ada677079020685b5a24568a3d6f1"
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
