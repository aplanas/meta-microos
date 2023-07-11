SUMMARY = "An automated system for building LaTeX documents"
DESCRIPTION = "Rubber is a building system for LaTeX documents. It is based on a routine that \
runs just as many compilations as necessary. The module system provides a \
great flexibility that virtually allows support for any package with no user \
intervention, as well as pre- and post-processing of the document. The \
standard modules currently provide support for bibtex, dvips, dvipdfm, pdftex, \
makeindex. A good number of standard packages are supported, including \
graphics/graphicx (with automatic conversion between various formats and \
Metapost compilation)."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "rubber-1.6.0-1.10.noarch.rpm"
RPM_HASH = "e477c5b05e421ebd9d812aa7ecd3a1425fb0c531dea3b1931d0d045466cd0dd9c4240cb5846334fb8c7984013926c4a1092cf45e5697dba5805335740f226bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rubber \
python3dist-rubber \
rubber"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
info \
python-abi \
python3 \
texlive-latex"

inherit rpm
