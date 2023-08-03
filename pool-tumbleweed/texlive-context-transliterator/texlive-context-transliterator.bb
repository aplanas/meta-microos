SUMMARY = "Transliterate text from 'other' alphabets"
DESCRIPTION = "The package will read text in one alphabet, and provide a \
transliterated version in another; this is useful for readers \
who cannot read the original alphabet. The package can make \
allowance for hyphenation."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn61127"

RPM_NAME = "texlive-context-transliterator-2023.209.svn61127-55.1.noarch.rpm"
RPM_HASH = "d6fa6a5edd9844fb4eb302770fd9303b503c4e5d99eb89201751299648ad194ec9b5c5325d9ddbc6a403d86747c6180c9fc4e9dadd5e3f32f056c1753f4f7643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-transliterator.tex \
texlive-context-transliterator"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
