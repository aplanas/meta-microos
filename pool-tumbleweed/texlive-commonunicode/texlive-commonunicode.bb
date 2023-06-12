SUMMARY = "Convert common unicode symbols to LaTeX code"
DESCRIPTION = "The aim of this LaTeX package is to provide a complete as \
possible list of common Unicode symbols with their translations \
to LaTeX code. This is useful in the development of templates \
which are intended to work with modern TeX engines (LuaTeX, \
XeTeX) as well as traditional ones (TeX, pdfTeX)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-2023.201.1.0.0svn62901-53.1.noarch.rpm"
RPM_HASH = "afa6029062aba7be25d80dc3533d3e156d6a6d55c5d72ade59d11616d8f878b5635d713ed335b973cdf58931eea1ba69797a900ab5c7112e22672358b61073e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(commonunicode.sty) \
texlive-commonunicode"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amssymb.sty) \
tex(mathrsfs.sty) \
tex(mathtools.sty) \
tex(stmaryrd.sty) \
tex(wasysym.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
