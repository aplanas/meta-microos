SUMMARY = "Embed Python code in LaTeX"
DESCRIPTION = "The package enables you to embed Python code in LaTeX, and \
insert the script's output in the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.22svn60162"

RPM_NAME = "texlive-python-2023.201.0.0.22svn60162-53.1.noarch.rpm"
RPM_HASH = "1325f130cc7ce2dba295ac17db7611afcbee57a8a01a64d4dda2e0fb702f9f1cf55100412fbeeeba363186bd917583c75967a2561b66294c9fe6c33c3fe1ac67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(python.sty) \
texlive-python"

RDEPENDS:${PN} += "/bin/sh \
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
