SUMMARY = "Greek letters in math mode from Libertinus or Linux Libertine/Biolinum"
DESCRIPTION = "This package allows LaTeX users (especially if using \
traditional LaTeX/pdfLaTeX) to set the Greek letters in math \
mode to use the glyphs from the Libertinus Serif or Sans font, \
via the font support files provided by the libertinus-type1 \
package of Bob Tennent. All Greek letters are defined both in \
\\...up and \\...it variants. The style (ISO, TeX, or French i. \
e. upright) can be modified midway in the document. A 'legacy' \
mode uses font support from the (obsolete) package \
https://ctan.org/pkg/libertine-legacy which map to the Linux \
Libertine or Biolinum fonts. This package is for users which \
only want to customize Greek letters in math mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65004"

RPM_NAME = "texlive-libgreek-2023.209.1.1svn65004-55.1.noarch.rpm"
RPM_HASH = "a013106083730ca96f1dbd060036fbbf0602bfcb921f833ad45e41f72db178ae69c54f038bc6ab02af7e20dace3cf32ab7340c49d86d332ceed798a34889e05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libgreek-legacy.sty \
tex-libgreek.sty \
texlive-libgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
