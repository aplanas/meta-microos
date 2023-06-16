SUMMARY = "A utility for making hyphenation patterns"
DESCRIPTION = "Mkpattern is a general purpose program for the generation of \
hyphenation patterns, with definition of letter sets and \
template-like constructions. It also provides an easy way to \
handle different input and output encodings, and featgures \
generation of clean UTF-8 patterns. The package was used for \
the creation of the Galician patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-mkpattern-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "1162ccfd657076e9c0e6f0395e99161b7754d94219f5f8f51e13a8a2d92dad0d83d8a02b2ef48b3dce825dc3f66572c6a7b94007a48d3bdb4a7710bae19d0a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mkpatter.tex \
texlive-mkpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
