SUMMARY = "Numeric citation style for IOP journals"
DESCRIPTION = "A BibTeX style providing numeric citation in Harvard-like \
format. Intended for use with Institute of Physics (IOP) \
journals, including Journal of Physics."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-iopart-num-2023.209.2.1svn15878-56.1.noarch.rpm"
RPM_HASH = "b88372b3378250b62ca40daeda1155fa8b066d3c44afe606f1ddcf2f8b1cfb2f129c1529874e4a08e0983934e201095737828d215bb32ab9318df7e98e72560d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num"

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
