SUMMARY = "A utility for making hyphenation patterns"
DESCRIPTION = "Mkpattern is a general purpose program for the generation of \
hyphenation patterns, with definition of letter sets and \
template-like constructions. It also provides an easy way to \
handle different input and output encodings, and featgures \
generation of clean UTF-8 patterns. The package was used for \
the creation of the Galician patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-mkpattern-2023.209.1.2svn15878-55.1.noarch.rpm"
RPM_HASH = "90ddaa35945c457ed1ebe40dc94a5c1beded9b50ab916c2baf6bd30fb507a1fb1181b6c28c9905d46e9d4707d9112e828465900e5436afdb02494a6e379bf489"
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
