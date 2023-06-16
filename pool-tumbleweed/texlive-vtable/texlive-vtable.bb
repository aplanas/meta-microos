SUMMARY = "Vertical alignement of table cells"
DESCRIPTION = "The package allows vertical alignement of table cell by \
providing: Z, L, C, R, J and I column types \\nextRow and \\lb \
commands \\setMultiColRow, \\setMultiColumn, \\setMultiRow and \
\\tableFormatedCell commands for tabular and similar \
environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51126"

RPM_NAME = "texlive-vtable-2023.201.1.0svn51126-53.1.noarch.rpm"
RPM_HASH = "e1dfffd8565aaee26c9a9e5b1ff50502f05cdca923ec17c6c1fd3dfe19d2038465844c47190207b3c95f5af1e9ca959bbed062ffd2c5fe6c937aa29147b27041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vtable.sty \
texlive-vtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-array.sty \
tex-calc.sty \
tex-dashrule.sty \
tex-etoolbox.sty \
tex-forloop.sty \
tex-graphicx.sty \
tex-varwidth.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
