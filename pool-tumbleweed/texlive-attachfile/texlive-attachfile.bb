SUMMARY = "Attach arbitrary files to a PDF document"
DESCRIPTION = "Starting with PDF 1.3 (Adobe Acrobat 4.0), PDF files can \
contain file attachments -- arbitrary files that a reader can \
extract, just like attachments to an e-mail message. The \
attachfile package brings this functionality to pdfLaTeX and \
provides some additional features not available in Acrobat, \
such as the ability to use arbitrary LaTeX code for the file \
icon -- including things like \\includegraphics, tabular, and \
mathematics. Settings can be made either globally or on a \
per-attachment basis. Attachfile makes it easy to attach files \
and customize their appearance in the enclosing document. The \
package supports the Created, Modified, and Size keys in the \
EmbeddedFile's Params dictionary."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn42099"

RPM_NAME = "texlive-attachfile-2023.201.1.9svn42099-53.1.noarch.rpm"
RPM_HASH = "f587adad7410e3d388a3413eb8b5111778ed7aafff21d795ed5f656f83b16e268a600a42a4bedddf18da1e2a3223b4c2af091cff575f166dfeb043202b2b60ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(attachfile.sty) \
texlive-attachfile"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(color.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
