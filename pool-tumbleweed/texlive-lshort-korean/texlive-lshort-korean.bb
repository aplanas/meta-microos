SUMMARY = "Korean introduction to LaTeX"
DESCRIPTION = "A translation of Oetiker's original (not so) short \
introduction."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.svn58468"

RPM_NAME = "texlive-lshort-korean-2023.209.svn58468-55.1.noarch.rpm"
RPM_HASH = "d2ba009881c06c0104a36251ef74bbc475045390a82cccc9c7d553b545f51687bb9194b705da42e5335cad34578a2297b7ce8e570a361773f5a4a0750272aa14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-korean"

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
