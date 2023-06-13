SUMMARY = "Bold latin and greek characters through simple prefix characters"
DESCRIPTION = "This package provides bold latin and greek characters within \
\\mathversion{normal}, by using ~ and ' as prefix characters."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-boldtensors-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "45fbf11c7b978bee93fb2c591f397a402f96507196d99c155ef2d03efcb8b8ea10acf3b78726ef8c86468a54f22ee6c7ce2c7491a5a12a62278f0af37687a410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(boldtensors.sty) \
texlive-boldtensors"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
font(bbold) \
grep \
sed \
tex(bbold.map) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
