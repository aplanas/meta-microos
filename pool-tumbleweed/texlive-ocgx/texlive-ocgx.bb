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

PV = "2023.201.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-2023.201.0.0.5svn54512-54.1.noarch.rpm"
RPM_HASH = "303ef645964bc52e8972b7250eae08f91c599171dc76b88696d0561cdec6e960d46f22ace4741d64214d0a8e9d2a3cd262e5c4098c2c560c29d5525227c03d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocgx.sty \
tex-tikzlibraryocgx.code.tex \
texlive-ocgx"

RDEPENDS:${PN} += "/bin/sh \
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
