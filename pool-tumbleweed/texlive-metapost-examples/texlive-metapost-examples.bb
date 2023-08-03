SUMMARY = "Example drawings using MetaPost"
DESCRIPTION = "These are a few (hundred) example pictures drawn with MetaPost, \
ranging from very simple (lines and circles) to rather \
intricate (uncommon geometric transformations, fractals, \
bitmap, etc)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-metapost-examples-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "fe1f859b34c158c419396e65a0cc0c6c02ec8f194c5201c631d05ad61706de57b0a176d675b3d238bf7a197b1a5e87e7905e7d332841433a0ad7c391cda59693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-examples"

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
