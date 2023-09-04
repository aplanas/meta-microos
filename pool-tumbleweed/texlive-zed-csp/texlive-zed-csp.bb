SUMMARY = "Typesetting Z and CSP format specifications"
DESCRIPTION = "The package supports real-time CSP and incorporates the \
functionality of Spivey's original Z package, written for LaTeX \
2.09."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17258"

RPM_NAME = "texlive-zed-csp-2023.209.svn17258-53.2.noarch.rpm"
RPM_HASH = "394956d11009cc80b9db4d7261b201e694ee106d9c17226e18edca23f4c96ee6035d40a8f48bc5b34f66bafbc7d73fbb3d64313fd3250e9a48114327855d4789"
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
