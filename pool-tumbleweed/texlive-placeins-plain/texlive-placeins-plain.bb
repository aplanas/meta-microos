SUMMARY = "Insertions that keep their place"
DESCRIPTION = "This TeX file provides various mechanisms (for plain TeX and \
close relatives) to let insertions (footnotes, topins, pageins, \
etc.) float within their appropriate section, but to prevent \
them from intruding into the following section, even when \
sections do not normally begin a new page. (If your sections \
normally begin a new page, just use \\supereject to flush out \
insertions.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-placeins-plain-2023.201.2.0svn15878-51.1.noarch.rpm"
RPM_HASH = "57c8d5c76cacf5b14557acb282e0e86d692db0822ac2b4edc97d100c8a743c22825983d946ee28dffa17e593550183a245ea131cbc9781efbfde1433c24bc02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeins.tex \
texlive-placeins-plain"

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
