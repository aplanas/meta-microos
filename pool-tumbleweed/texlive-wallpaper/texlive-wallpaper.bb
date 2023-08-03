SUMMARY = "Easy addition of wallpapers (background images) to LaTeX documents, including tiling"
DESCRIPTION = "This collection contains files to add wallpapers (background \
images) to LaTeX documents. It uses the eso-pic package, but \
provides simple commands to include effects such as tiling. An \
example is provided, which works under both LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-wallpaper-2023.209.1.10svn15878-54.1.noarch.rpm"
RPM_HASH = "71e6261c20f24940ab85627daddc7e19299a7088e28dfc866c07bcf1f62ab23f3f55c7011655f0c008a5d9cdbcde1255ff62fe8298965bc336f2b968832794e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wallpaper.sty \
texlive-wallpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
