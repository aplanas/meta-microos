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

RPM_NAME = "texlive-xsavebox-2023.201.0.0.18svn64049-52.1.noarch.rpm"
RPM_HASH = "14ab88481d90c6a3e396b66736c0a857c4ead40d0d22d5583334f5e1ac908c2762286463a4adb064f492bc31dc088e660ca651f792426d4b717d842a10002a4a"
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
