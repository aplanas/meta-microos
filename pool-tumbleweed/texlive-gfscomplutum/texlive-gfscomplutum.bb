SUMMARY = "A Greek font with a long history"
DESCRIPTION = "GFS Complutum derives, via a long development, from a \
minuscule-only font cut in the 16th century. An unsatisfactory \
set of majuscules were added in the early 20th century, but its \
author died before he could complete the revival of the font. \
The Greek Font Society has released this version, which has a \
new set of majuscules."
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "b0553497a207dc2c33fa2a01aaec368e20854eb377c7e9830bb8916dc3602c86af5b9c447c7a48a1d031c61858e683a15570cd3682febbfa911e2a953f7db416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gcomplutum8a.tfm) \
tex(gcomplutum8a.vf) \
tex(gcomplutum8r.tfm) \
tex(gcomplutumo8a.tfm) \
tex(gcomplutumo8a.vf) \
tex(gcomplutumo8r.tfm) \
tex(gfscomplutum.map) \
tex(gfscomplutum.sty) \
tex(gpcomplutum.enc) \
tex(lgrcomplutum.fd) \
texlive-gfscomplutum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-gfscomplutum-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
