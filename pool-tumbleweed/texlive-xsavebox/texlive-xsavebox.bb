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

PV = "2023.209.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-2023.209.0.0.18svn64049-53.2.noarch.rpm"
RPM_HASH = "5c5b2108606eeb01255bb3f5ca953208ee8d4da17cc336103cceaa4d1724bae1341fb10fe6144376ccc9df1a4b6fede84338ed1fb7b20bda52199cf1927d9964"
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
