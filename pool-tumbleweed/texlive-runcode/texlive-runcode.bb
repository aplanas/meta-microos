SUMMARY = "Execute foreign source code and embed the result in the pdf file"
DESCRIPTION = "This LaTeX package executes programming source codes (including \
all command line tools) from within LaTeX and embeds the output \
in the resulting .pdf file. Many programming languages can be \
easily used and any command-line executable can be invoked when \
preparing the .pdf file from a .tex file. It is however \
recommended to use this package in server-mode together with \
the Python talk2stat package. Currently, this server-mode \
supports Julia, MatLab, Python, and R. More languages will be \
added. For more details and usage examples, refer to the \
package's github repository."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn65588"

RPM_NAME = "texlive-runcode-2023.209.1.8svn65588-54.1.noarch.rpm"
RPM_HASH = "23a1a66f02617ce5b56cf8067932ff9592669d4284df1ad82d5b5a98c8c92a466eab716a2d804aae3490bbfc4157d67f7090b47264b6796931b5b2baa44ebfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-runcode.sty \
texlive-runcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-filecontents.sty \
tex-fvextra.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-minted.sty \
tex-morewrites.sty \
tex-tcolorbox.sty \
tex-textgreek.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
