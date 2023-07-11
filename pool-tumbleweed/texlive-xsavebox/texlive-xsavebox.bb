SUMMARY = "Saveboxes for repeating content without code replication, based on PDF Form XObjects"
DESCRIPTION = "The package defines commands for saving content that can be \
repeatedly placed into the document without replicating DVI/PDF \
code in the output file, allowing for smaller file size of the \
final PDF and improved content caching for faster display in \
certain PDF viewers. The method makes use of 'Form XObjects' \
defined in the PDF specification. The user commands are \
modelled after the standard LaTeX commands \\savebox, \\sbox, \
\\usebox and the lrbox environment. All common TeX engines and \
back-ends are supported: pdfLaTeX, LuaLaTeX LaTeX - dvips - \
ps2pdf/Distiller (Xe)LaTeX - (x)dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-2023.201.0.0.18svn64049-52.2.noarch.rpm"
RPM_HASH = "98b612f05a480c724e40936b26887b1b02bd71b77d80751d50d6123a408a2a976b4e3296716f8f247273c044a73f75320745638ed31e088919ceb9db10520942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xsavebox.sty \
texlive-xsavebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
