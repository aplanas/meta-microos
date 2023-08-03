SUMMARY = "Three dimensional objects using PSTricks"
DESCRIPTION = "The package uses PSTricks to provide basic three-dimensional \
objects. As yet, only cubes (which can be deformed to \
rectangular parallelipipeds) and dies (which are only a special \
kind of cubes) are defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-2023.209.0.0.22svn54514-53.1.noarch.rpm"
RPM_HASH = "ac8cb3452c51b00eec4503c1e38b964e1187fe88f0220166ee0ad020a7ae36091addd764fb5b22eb4e2355f534dd545fb1a3102be6a1c7de38b0135ef774bea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ob3d.sty \
tex-pst-ob3d.tex \
texlive-pst-ob3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
