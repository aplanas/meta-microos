SUMMARY = "Variants of \\fbox and other games with boxes"
DESCRIPTION = "Provides variants of \\fbox: \\shadowbox, \\doublebox, \\ovalbox, \
\\Ovalbox, with helpful tools for using box macros and flexible \
verbatim macros. You can box mathematics, floats, center, \
flushleft, and flushright, lists, and pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn18304"

RPM_NAME = "texlive-fancybox-2023.209.1.4svn18304-53.1.noarch.rpm"
RPM_HASH = "07006854dbd79d798ff3a7496ec2b686aa9ab004386e644bd4a4001f394b7ae5ca1671bdfcb3b6d5e1b0b4b14bd9b2aceb5e7e4d929ca106c2821c2bab90c6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancybox.sty \
texlive-fancybox"

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
