SUMMARY = "Extended file name support for graphics (legacy package)"
DESCRIPTION = "The original package extended the file name processing of \
package graphics to support a larger range of file names. The \
base LaTeX code now supports multiple dots and spaces, and this \
package by default is a stub that just loads graphicx. However, \
\\usepackage{grffile}[=v1] may be used to access version 1(.18) \
of the package if that is needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn52756"

RPM_NAME = "texlive-grffile-2023.201.2.1svn52756-53.2.noarch.rpm"
RPM_HASH = "b0da8b9741b36e3cbe55db2c68de6ef1e0838f2a5ad544eed35bdf95f4665524843c1ec01c1f845b799a98da78e8091aab8850a2a6b446ac8207932017fa4dbf"
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
