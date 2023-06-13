SUMMARY = "Variants of last page labels"
DESCRIPTION = "The package was designed as an extension of the lastpage \
package -- as well as that package's LastPage label (created \
\\AtEndDocument) it adds a VeryLastPage (created \
\\AfterLastShipout). When more than one page numbering scheme is \
in operation (as in a book class document with frontmatter), \
the labels above do not give the total number of pages, so the \
package also provides labels pagesLTS.<numbering scheme>, where \
the numbering scheme is arabic, roman, etc. The package relies \
on the undolabl package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2fsvn39164"

RPM_NAME = "texlive-pageslts-2023.201.1.2fsvn39164-51.1.noarch.rpm"
RPM_HASH = "0d01f169288954846d12684fb489c3c06084cdf176d6dd999175792417c99f69e093596961722a78c49d1b97ff0117576008c67dd8f59fad7efeb608635e5379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pageslts.sty) \
texlive-pageslts"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphalph.sty) \
tex(atveryend.sty) \
tex(everyshi.sty) \
tex(kvoptions.sty) \
tex(letltxmacro.sty) \
tex(ltxcmds.sty) \
tex(rerunfilecheck.sty) \
tex(undolabl.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
