SUMMARY = "Typeset parallel texts"
DESCRIPTION = "Provides a parallel environment which allows two potentially \
different texts to be typeset in two columns, while maintaining \
alignment. The two columns may be on the same page, or on \
facing pages. This arrangement of text is commonly used when \
typesetting translations, but it can have value when comparing \
any two texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-parallel-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "dff732eb97fbf6eba320d0967cff4e73ae85c796c0979ee6c08896695f5e54ea9dd2c777453d4dac32e93e15d3303ef88e363e0b0310d42c9ae60bea031392df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parallel.sty \
texlive-parallel"

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
