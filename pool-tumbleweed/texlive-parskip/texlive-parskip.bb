SUMMARY = "Layout with zero \\parindent, non-zero \\parskip"
DESCRIPTION = "Simply changing \\parskip and \\parindent leaves a layout that is \
untidy; this package (though it is no substitute for a \
properly-designed class) helps alleviate this untidiness."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0hsvn58358"

RPM_NAME = "texlive-parskip-2023.201.2.0hsvn58358-51.1.noarch.rpm"
RPM_HASH = "da576ebd4212a5423285d550f7102f72f5e4fd796f9d6c5901c9236b8b2e3b513bc4c45218f5d0a6c37cd3c4eb6cee822ab6b635c51fe871ec757e2b022130fb"
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
