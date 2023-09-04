SUMMARY = "Convert one DVI file into another"
DESCRIPTION = "The output DVI file's contents are specified by page selection \
commands; series of pages and page number ranges may be \
specified, as well as inclusions and exclusions."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65952"

RPM_NAME = "texlive-dvidvi-2023.209.svn65952-54.2.noarch.rpm"
RPM_HASH = "73e680b8802ea41ebd3f981e051996239217e78f8de425f0961edfb79e4b75e73c668df6c98138d54249e29d29e4d3f504a6351d424e83044cb29bf8e120e5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvidvi.1 \
texlive-dvidvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvidvi-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
