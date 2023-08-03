SUMMARY = "Chicago-style footnote formatting"
DESCRIPTION = "A very short snippet. Will set the footnotes to be conformant \
with the Chicago style, so the footnotes at the bottom of the \
page are now marked with a full-sized number, rather than with \
a superscript number."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57312"

RPM_NAME = "texlive-chifoot-2023.209.1.0svn57312-54.1.noarch.rpm"
RPM_HASH = "306b4c8ae15cdff35bc7b287421b2f5975855a539409e7b81f622af3bc8362c7dcd21eefb92294e4f6018e2fa9829890bf92d3126070daf5da62a56856f50d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chifoot.sty \
texlive-chifoot"

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
