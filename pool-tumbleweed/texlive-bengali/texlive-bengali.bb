SUMMARY = "Support for the Bengali language"
DESCRIPTION = "The package is based on Velthuis' transliteration scheme, with \
extensions to deal with the Bengali letters that are not in \
Devanagari. The package also supports Assamese."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-bengali-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "3619cd26192d5ba3add5d4614777b7599f043204a086337acc6edc7fb8c2365af09b6deb0979823222df17fcdb791a3716c9f3a26c9f9dc12d172f0d9488ee04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beng.sty) \
tex(bnr10.tfm) \
tex(bnsl10.tfm) \
tex(ubn.fd) \
tex(ubnx.fd) \
tex(xbnr10.tfm) \
tex(xbnsl10.tfm) \
texlive-bengali"

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
