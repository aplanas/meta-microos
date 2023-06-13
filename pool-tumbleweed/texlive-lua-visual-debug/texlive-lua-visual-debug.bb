SUMMARY = "Visual debugging with LuaLaTeX"
DESCRIPTION = "The package uses lua code to provide visible indications of \
boxes, glues, kerns and penalties in the PDF output. The \
package is known to work in LaTeX and Plain TeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn65464"

RPM_NAME = "texlive-lua-visual-debug-2023.201.0.0.9svn65464-52.1.noarch.rpm"
RPM_HASH = "2e8a8006563e3cbbfaf628fb7dae610d7951bacd8aa3cd38201f4251e693364c96431e3ee6cd8312b503a0f93dab7140e17d1f06db518b91a0ee65cd17c624cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lua-visual-debug.sty) \
texlive-lua-visual-debug"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(ifluatex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
