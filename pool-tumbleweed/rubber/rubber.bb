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

RPM_NAME = "rubber-1.6.0-1.9.noarch.rpm"
RPM_HASH = "05760c8ff9c28a858c7aeca5e5ed2fe31c63e97e67a9c025338f7505f76dfcb2419255782f024595b1db6f6ebf69ecc5896bf161fa8a20e6b3ab25db02117d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rubber \
python3dist-rubber \
rubber"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
info \
python-abi \
python3 \
texlive-latex"

inherit rpm
