SUMMARY = "A wide-character-set extension of TeX"
DESCRIPTION = "A development of TeX, which deals in multi-octet Unicode \
characters, to enable native treatment of a wide range of \
languages without changing character-set. Work on Omega has \
ceased (the TeX Live package contains only support files); its \
compatible successor is aleph, which is itself also in major \
maintenance mode only. Ongoing projects developing Omega (and \
Aleph) ideas include Omega-2 and LuaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-omegaware-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "de0ae42d44dc06fba4912a60d129b72c9050d8c063cb199410126aab67330550c3f9a9278b9c4b2cc2d108ba22c4d8b3d2eb3e7052e2d50361e58150837982de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-odvicopy.1 \
man-odvitype.1 \
man-ofm2opl.1 \
man-opl2ofm.1 \
man-otangle.1 \
man-otp2ocp.1 \
man-outocp.1 \
man-ovf2ovp.1 \
man-ovp2ovf.1 \
texlive-omegaware"

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
texlive-omegaware-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
