SUMMARY = "Experimental bidi-aware text highlighting"
DESCRIPTION = "Experimental bidi-aware text highlighting."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn37795"

RPM_NAME = "texlive-bidihl-2023.209.0.0.1csvn37795-54.1.noarch.rpm"
RPM_HASH = "41c3bdb78f12ca23fc436c8c79e3897ddcdbaa82dd6486cfa3c9779b9d0730a3880f2740f549799990260f22c5b48f1ace881395c34d17a75be555e19985339b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidihl.sty \
texlive-bidihl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
