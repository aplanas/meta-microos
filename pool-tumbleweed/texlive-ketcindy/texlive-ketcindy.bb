SUMMARY = "Macros for graphic generation and Cinderella plugin"
DESCRIPTION = "KETpic is a macro package designed for computer algebra systems \
(CAS) to generate LaTeX source codes for high-quality \
mathematical artwork. KETcindy is a plugin for Cinderella that \
allows to generate graphics using KETpic. The generated code \
can be included in any LaTeX document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-2023.209.20191225.0svn58661-56.1.noarch.rpm"
RPM_HASH = "51e6217428d079e302b443ae5df3138c9bf89e684f750ec285a25c566d90fff2cdcc3eb4306f7162ab29a5e1f54361f6c05d3466eaea71dfc8baef0088538ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-KetCindyPlugin.jar \
tex-ketlayer.sty \
tex-ketlayer2e.sty \
tex-ketmedia.sty \
tex-ketpic.sty \
tex-ketpic2e.sty \
tex-ketslide.sty \
tex-ketslide2.sty \
texlive-ketcindy"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
perl-Digest--MD5 \
perl-File--Copy \
perl-strict \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-color.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-ketcindy-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
