SUMMARY = "Portuges language module for glossaries package"
DESCRIPTION = "Portuges language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-2023.209.1.1svn36064-54.2.noarch.rpm"
RPM_HASH = "98dbed5e96ac56e8ff15e739a695d1d37b55aaa98b386e5c5794ee5cea0649f57a6719565fcc06764b332594286202b4054448008c439f51c23d67c51809f20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-portuges-noenc.ldf \
tex-glossaries-portuges-utf8.ldf \
tex-glossaries-portuges.ldf \
tex-glossaries-pt-BR.ldf \
texlive-glossaries-portuges"

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
