SUMMARY = "Writing big integrals"
DESCRIPTION = "The package provides facilities for drawing big integral signs \
when needed. An example would be when the integrand is a \
matrix."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-bigints-2023.209.svn29803-54.1.noarch.rpm"
RPM_HASH = "bbdfd7fcc688fd1ed887ad7b07b795d89ea593010c8d8c1fbc82aa7d4c0ee90c1c7c11d48f195b1930a3030e27c875961e1c481c9ef54518b73d68ced2f7e38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigints.sty \
texlive-bigints"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
