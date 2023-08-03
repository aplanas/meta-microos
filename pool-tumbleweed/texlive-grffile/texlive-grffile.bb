SUMMARY = "Extended file name support for graphics (legacy package)"
DESCRIPTION = "The original package extended the file name processing of \
package graphics to support a larger range of file names. The \
base LaTeX code now supports multiple dots and spaces, and this \
package by default is a stub that just loads graphicx. However, \
\\usepackage{grffile}[=v1] may be used to access version 1(.18) \
of the package if that is needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn52756"

RPM_NAME = "texlive-grffile-2023.209.2.1svn52756-54.1.noarch.rpm"
RPM_HASH = "8404292d22a7eb742be1344b8b6a13fd86eddd21d65f244af237c6621227e79b97703f02aba3a85359b89f3c077085aba2507083d6877172cb73aaf56ffe7dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grffile-2017-06-30.sty \
tex-grffile.sty \
texlive-grffile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
