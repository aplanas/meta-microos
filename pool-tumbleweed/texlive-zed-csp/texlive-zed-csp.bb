SUMMARY = "Typesetting Z and CSP format specifications"
DESCRIPTION = "The package supports real-time CSP and incorporates the \
functionality of Spivey's original Z package, written for LaTeX \
2.09."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17258"

RPM_NAME = "texlive-zed-csp-2023.201.svn17258-52.2.noarch.rpm"
RPM_HASH = "b9375d916b1cae9c5aa6397ec903773470d92a869658425ab9523c0f00f7a5502f97cd81e6475f692a114d3dc0368dac5903caca95b3be7a4dd1ab8c0b8addc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zed-csp.sty \
texlive-zed-csp"

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
