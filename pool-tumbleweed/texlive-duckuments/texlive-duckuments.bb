SUMMARY = "Create duckified dummy content"
DESCRIPTION = "The package provides facilities to create duckified dummy \
contents. It was inspired by the question 'Getting ducks in \
example images' on TeX-LaTeX Stack Exchange. The following \
macros are available: \\duckument[key=val] - print a short \
duckument \\blindduck[key=val] - print a paragraph \
\\ducklist(*){environment} - create a list of type environment \
\\ducklistlist(*){environment} - create nested lists \
\\duckitemize - ducklist{itemize} \\duckenumerate - \
ducklist{enumerate} \\duckdescription - ducklist{description} \
\\duckumentsCreateExampleFile \\duckumentsDrawRandomDucks The \
package works with pdfTeX, LuaTeX, and XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn52271"

RPM_NAME = "texlive-duckuments-2023.209.0.0.5svn52271-53.1.noarch.rpm"
RPM_HASH = "a93a0cb8f491f58de5c33f8df73f438883795ceba2ff7aae88a6270850a22548acadff5a6afe0632a539583b6a2a752ba0be99cc426cdfc4b42d7b6d1f5c14cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duckuments.sty \
texlive-duckuments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-letltxmacro.sty \
tex-tikzducks.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
