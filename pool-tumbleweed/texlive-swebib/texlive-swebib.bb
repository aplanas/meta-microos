SUMMARY = "Swedish bibliography styles"
DESCRIPTION = "The bundle contains Swedish versions of the standard \
bibliography styles, and of the style plainnat. The styles \
should be funtionally equivalent to the corresponding original \
styles, apart from the Swedish translations. The styles do not \
implement Swedish collation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-swebib-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "9a01b0a81491177d35fc0ffab64a44f73ff5ba143b1a6784cbbce0b345c8cb3ae47b86fffb4feea2d8a987a97f0eda1bcbafe5539706908ca0bcedb4e8ecad2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib"

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
