SUMMARY = "Ruby annotations in ConTeXt"
DESCRIPTION = "Ruby markup (aka furigana in Japan) are inline annotations \
above or below a word to indicate the reading of ideographic \
characters. The module implements the W3C specification for \
simple ruby in ConTeXt. The position and layout of the base \
text and the ruby text can becontrolled by parameters."
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-ruby-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "2afbaeaefbb5d06e177248b64eece800e3556b068bb95b1da4c86ee118c02b16f0ddabd49c997c19e5ad2bc89d3e3e3fc6a74c10fae041dd0a4ef18dccb417d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-ruby"

RDEPENDS:${PN} += "/bin/sh \
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
