SUMMARY = "Support for the Bengali language"
DESCRIPTION = "The package is based on Velthuis' transliteration scheme, with \
extensions to deal with the Bengali letters that are not in \
Devanagari. The package also supports Assamese."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-bengali-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "0281b8ac4a5e716ca59617c17907eb755defd3437a09fff34d64814f7d50131d34ff41a3b81b8ab620fdd90a4a3018401e655462d3fadb41218917edfdaa49e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beng.sty \
tex-bnr10.tfm \
tex-bnsl10.tfm \
tex-ubn.fd \
tex-ubnx.fd \
tex-xbnr10.tfm \
tex-xbnsl10.tfm \
texlive-bengali"

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
