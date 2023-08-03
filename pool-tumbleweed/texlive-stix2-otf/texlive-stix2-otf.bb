SUMMARY = "OpenType Unicode text and maths fonts"
DESCRIPTION = "The Scientific and Technical Information eXchange (STIX) fonts \
are intended to satisfy the demanding needs of authors, \
publishers, printers, and others working in the scientific, \
medical, and technical fields. They combine a comprehensive \
Unicode-based collection of mathematical symbols and alphabets \
with a set of text faces suitable for professional publishing. \
The fonts are available royalty-free under the SIL Open Font \
License."
LICENSE = "OFL-1.1"

PV = "2023.209.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-2023.209.2.12svn58735-58.1.noarch.rpm"
RPM_HASH = "6ca1735cb2aec02ae5c00a89b58d79328f85262f20cd9ab8fb58c2fcc89f040a71bea5a59b1573c29bc364fc190acb0753a71c83562b1d2681facfc70e0acecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf"

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
texlive-scripts-bin \
texlive-stix2-otf-fonts"

inherit rpm
