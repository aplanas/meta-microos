SUMMARY = "Layout with zero \\parindent, non-zero \\parskip"
DESCRIPTION = "Simply changing \\parskip and \\parindent leaves a layout that is \
untidy; this package (though it is no substitute for a \
properly-designed class) helps alleviate this untidiness."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0hsvn58358"

RPM_NAME = "texlive-parskip-2023.209.2.0hsvn58358-52.1.noarch.rpm"
RPM_HASH = "525d7231603799779d6865e8e2ee4620bc07f3e5e926699a3fbf3b27ba03eb826819f75666b9407fe049ce3d875673f51bc6af3ee62ffdf9852dd6d88ddfb7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parskip-2001-04-09.sty \
tex-parskip.sty \
texlive-parskip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
