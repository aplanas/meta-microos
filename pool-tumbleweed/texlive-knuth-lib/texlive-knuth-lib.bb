SUMMARY = "Core TeX and Metafont sources from Knuth"
DESCRIPTION = "A collection of core TeX and Metafont macro files from DEK, \
apart from the plain format and base. Includes the MF logo \
font(s), webmac.tex, etc."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn57963"

RPM_NAME = "texlive-knuth-lib-2023.209.svn57963-56.1.noarch.rpm"
RPM_HASH = "f5ed3f63ef8aa66cc095217e20075bba8122a5ec978f78fc773b73ce4c8066ce6b32996c223d90020409a18c4a012b486e7e6271c2a94df482787195b8a8c755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logo10.tfm \
tex-logo8.tfm \
tex-logo9.tfm \
tex-logobf10.tfm \
tex-logosl10.tfm \
tex-manfnt.tfm \
tex-manmac.tex \
tex-mftmac.tex \
tex-null.tex \
tex-story.tex \
tex-testfont.tex \
tex-webmac.tex \
texlive-knuth-lib \
texlive-misc"

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
