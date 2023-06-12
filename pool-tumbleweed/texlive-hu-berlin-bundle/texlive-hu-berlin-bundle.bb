SUMMARY = "LaTeX classes for the Humboldt-Universitat zu Berlin"
DESCRIPTION = "This package provides files according to the corporate design \
of the Humboldt-Universitat zu Berlin. This is not an official \
package by the university itself, and not officially approved \
by it. More information can be found in the Humboldt \
University's corporate design guideline and on the website \
https://www.hu-berlin.de/de/hu-intern/design. At present, the \
bundle contains a letter class based on scrlttr2 and a package \
hu-berlin-base.sty which contains all relevant code for \
documents and documentclasses of the bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57580"

RPM_NAME = "texlive-hu-berlin-bundle-2023.201.1.1.1svn57580-52.1.noarch.rpm"
RPM_HASH = "21ada568c452ba3fcad047c54be4289abf0de426c501b9f2c5fc5c1dd612fdfc63627931a93105663ffb29653e1b840cb941fe42d2be6a223069031ae931e929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hu-berlin-base.sty) \
tex(hu-berlin-bundle-style.sty) \
tex(hu-berlin-letter.cls) \
texlive-hu-berlin-bundle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(babel.sty) \
tex(biblatex.sty) \
tex(bookmark.sty) \
tex(calc.sty) \
tex(ccicons.sty) \
tex(dirtree.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(hyperxmp.sty) \
tex(ifluatex.sty) \
tex(libertine.sty) \
tex(listings.sty) \
tex(luatex85.sty) \
tex(luatexbase.sty) \
tex(marginnote.sty) \
tex(markdown.sty) \
tex(marvosym.sty) \
tex(microtype.sty) \
tex(newfile.sty) \
tex(pdfpages.sty) \
tex(ragged2e.sty) \
tex(scrlayer-scrpage.sty) \
tex(url.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
