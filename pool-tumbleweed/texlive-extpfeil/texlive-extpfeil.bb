SUMMARY = "Extensible arrows in mathematics"
DESCRIPTION = "The package provides some more extensible arrows (usable in the \
same way as \\xleftarrow from amsmath), and a simple command to \
create new ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn16243"

RPM_NAME = "texlive-extpfeil-2023.201.0.0.4svn16243-52.1.noarch.rpm"
RPM_HASH = "b60befbe2fc0d62e3855f5fde32441b9bc8aec2868c2e5e088cf10b2ddec30f39d5a6efdfa186891dcd255ff6ec0797a013ccc67e8c9802092096447263dce57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(extpfeil.sty) \
texlive-extpfeil"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(mathtools.sty) \
tex(stmaryrd.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
