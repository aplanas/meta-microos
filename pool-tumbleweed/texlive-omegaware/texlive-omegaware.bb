SUMMARY = "A wide-character-set extension of TeX"
DESCRIPTION = "A development of TeX, which deals in multi-octet Unicode \
characters, to enable native treatment of a wide range of \
languages without changing character-set. Work on Omega has \
ceased (the TeX Live package contains only support files); its \
compatible successor is aleph, which is itself also in major \
maintenance mode only. Ongoing projects developing Omega (and \
Aleph) ideas include Omega-2 and LuaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-omegaware-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "e9f98dd079c8f9775bf28e5531bd84f52de29c2c93b3b8ca7ad9e6f6d565f2b0fdc9855bdf21843e45b3f1268a6689903a3b65e7e3b50c31d104d71a6e41557b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(odvicopy.1) \
man(odvitype.1) \
man(ofm2opl.1) \
man(opl2ofm.1) \
man(otangle.1) \
man(otp2ocp.1) \
man(outocp.1) \
man(ovf2ovp.1) \
man(ovp2ovf.1) \
texlive-omegaware"

RDEPENDS:${PN} += "/bin/sh \
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
