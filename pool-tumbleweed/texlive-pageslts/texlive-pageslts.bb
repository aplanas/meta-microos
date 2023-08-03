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

PV = "2023.209.1.2fsvn39164"

RPM_NAME = "texlive-pageslts-2023.209.1.2fsvn39164-52.1.noarch.rpm"
RPM_HASH = "0298be904ce49e087914a613d4138dce3830c988d6c3820fe4cb2c716072833507fc37e43044f3b7efa36192a3b0a1e8a86c18a9704d884fabae3ce159ba216f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pageslts.sty \
texlive-pageslts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-atveryend.sty \
tex-everyshi.sty \
tex-kvoptions.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-rerunfilecheck.sty \
tex-undolabl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
