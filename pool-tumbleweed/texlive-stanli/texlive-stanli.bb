SUMMARY = "TikZ Library for Structural Analysis"
DESCRIPTION = "stanli is a STructural ANalysis LIbrary based on PGF/TikZ. \
Creating new assignments and tests, at university, is usually a \
very time-consuming task, especially when this includes drawing \
graphics. In the field of structural engineering, those small \
structures are a key part for teaching. This package permits to \
create such 2D and 3D structures in a very fast and simple way."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.0svn54512"

RPM_NAME = "texlive-stanli-2023.209.3.0svn54512-58.1.noarch.rpm"
RPM_HASH = "7dd2f9ff19166c49ca8b1c92454d9b85e7f6e98b6a407b9c320d6c4e2b87261f7eb07fd206e965a7b280dcd20a38f49ed99bf84d843da9e7768481df68690430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stanli.sty \
texlive-stanli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
