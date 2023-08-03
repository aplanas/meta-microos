SUMMARY = "Extensible arrows in mathematics"
DESCRIPTION = "The package provides some more extensible arrows (usable in the \
same way as \\xleftarrow from amsmath), and a simple command to \
create new ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn16243"

RPM_NAME = "texlive-extpfeil-2023.209.0.0.4svn16243-53.1.noarch.rpm"
RPM_HASH = "7d642ee36d99ad14168dc125bf927e0a5196053b145d1829e5d02db90274a5d49e5f5a2be01d26909cd3b8c4166ed1f38e858727fd1dc27765182fa0c63d7a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extpfeil.sty \
texlive-extpfeil"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-mathtools.sty \
tex-stmaryrd.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
