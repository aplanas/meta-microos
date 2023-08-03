SUMMARY = "Ruby annotations in ConTeXt"
DESCRIPTION = "Ruby markup (aka furigana in Japan) are inline annotations \
above or below a word to indicate the reading of ideographic \
characters. The module implements the W3C specification for \
simple ruby in ConTeXt. The position and layout of the base \
text and the ruby text can becontrolled by parameters."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-ruby-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "0753f246f8a63e4ddc3f0a42c7ce6f72a968fd54277e102732f8e5a2f59236f310ebd451e10a721829255478a4c8637365d246f66652fce4a151827247d8efdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-ruby"

RDEPENDS:${PN} += "/usr/bin/sh \
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
