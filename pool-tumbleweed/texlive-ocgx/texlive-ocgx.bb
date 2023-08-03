SUMMARY = "Use OCGs within a PDF document without JavaScript"
DESCRIPTION = "The package extends the ocg package, which allows you to create \
OCGs (Optional Content Groups) in PDF documents. (The ocg \
package is distributed as part of Asymptote.) Every OCG \
includes TeX material into a layer of the PDF file. Each of \
these layers can be displayed or not. Links can enable or \
disable the display of OCGs. The ocgx package does not use \
Javascript embedded in the PDF document to enable (to show) or \
disable (to hide) OCGs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-2023.209.0.0.5svn54512-55.1.noarch.rpm"
RPM_HASH = "5c49a150e6890ed1b7dc12d61878ad8d8de4a61358cc3412d46c24ecfd877ea348aca2ed822303e11ad9df603002bfe08c6463dd822ea8ed1ff355bb7ef47573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocgx.sty \
tex-tikzlibraryocgx.code.tex \
texlive-ocgx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ocg-p.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
