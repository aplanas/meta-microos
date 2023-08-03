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

RPM_NAME = "texlive-xsavebox-2023.209.0.0.18svn64049-53.1.noarch.rpm"
RPM_HASH = "3a8d91058462397f4b7545a65b4127cf9144b6e619b6e7c56af331a9f5ec2fdd7b49d84d1f7c8e135cb425146a8f8956591d0d3af150c092fb21a0fc1947f6ef"
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
