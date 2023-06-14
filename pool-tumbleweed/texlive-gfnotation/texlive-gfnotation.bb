SUMMARY = "Typeset Gottlob Frege's notation in plain TeX"
DESCRIPTION = "The package implements macros for plain TeX to typeset the \
notation invented by Gottlob Frege in 1879 for his books \
'Begriffsschrift' and 'Grundgesetze der Arithmetik' (two \
volumes). The output styles of both books are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.9svn37156"

RPM_NAME = "texlive-gfnotation-2023.201.2.9svn37156-52.1.noarch.rpm"
RPM_HASH = "e8e9c7704ce76196249854a1c26258df37a74c9aca2a7cab35e3e906f21ae9b8d721c7babde93693b4d3391a35fe87f25ca1e0ba825ac31b6e90aff4104a1e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-GFnotation.tex \
texlive-gfnotation"

RDEPENDS:${PN} += "/bin/sh \
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
