SUMMARY = "Coloured syntax highlights in documentation"
DESCRIPTION = "The package is used in documentation files (that use the doc \
package); with it the code listings will highlight (for \
example) pairs of curly braces with matching colors. Other \
delimiters like \\if ... \\fi, are highlighted, as are the names \
of new commands. All this makes code a little more readable, \
and helps during process of writing. Three options are \
provided, including a non-color option designed for printing \
(which numbers delimiters and underlines new commands)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18270"

RPM_NAME = "texlive-colordoc-2023.209.svn18270-54.1.noarch.rpm"
RPM_HASH = "190d464275bc5c85dfaf159299a444aa7e232ad598e8131d8409631879eea82d62ab20456ff96c9fdeffe9a97b8848dd5536f27241b8407bc627f1f924e407e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colordoc.sty \
texlive-colordoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fixltx2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
