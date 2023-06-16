SUMMARY = "XSL stylesheets for TEI XML"
DESCRIPTION = "Stylesheets to transform TEI XML documents (version p4 and p5) to HTML \
or to XSL Formatting Objects (FO). You can also produce LaTeX output. \
 \
Use it with xsltproc (part of libxslt), Saxon, or any other XSLT \
processor."
LICENSE = "LGPL-2.1+"

PV = "7.40.1"

RPM_NAME = "tei-xsl-stylesheets-7.40.1-1.17.noarch.rpm"
RPM_HASH = "c5cd7dc4a826030bf8f9cc3f141728a097fe7b0d3616600a2225ca940bb3762332fc29658dc1a4db34258f34f47705dedd2c7dd580fb3ddc6e8a90802f529962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tei-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
