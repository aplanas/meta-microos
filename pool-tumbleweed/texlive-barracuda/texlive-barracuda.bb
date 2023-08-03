SUMMARY = "Draw barcodes with Lua"
DESCRIPTION = "The barracuda library is a modular Lua package for drawing \
barcode symbols. It provides modules for writing barcodes from \
a LuaTeX document. It is also possible to use Barracuda with a \
standalone Lua interpreter to draw barcodes in different \
graphic formats like SVG."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-2023.209.0.0.0.12svn63708-54.1.noarch.rpm"
RPM_HASH = "894b80b9408c17f45c5ccbb951136488b48bcebace3738e7772cf55c75a619628ab0a94cf4a7b9ccdfad3782608463e9154100e184728f28e7916eb170c03086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barracuda.sty \
texlive-barracuda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
