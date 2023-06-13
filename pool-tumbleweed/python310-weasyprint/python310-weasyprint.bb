SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "56.1"

RPM_NAME = "python310-weasyprint-56.1-1.4.noarch.rpm"
RPM_HASH = "600af1e519e400505a3d6d3e842e61895675f5062d182c96ee21393584d31c6df1a865f5cf57da9ae040b3a7731c9b8e4f7cd7c1ff4119e5ebc5053b5f4963a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WeasyPrint \
python3-weasyprint \
python3.10dist(weasyprint) \
python310-WeasyPrint \
python310-weasyprint \
python3dist(weasyprint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
libgobject-2_0-0 \
pango \
python(abi) \
python310-Brotli \
python310-FontTools \
python310-Pillow \
python310-Pyphen \
python310-base \
python310-cffi \
python310-cssselect2 \
python310-html5lib \
python310-pydyf \
python310-tinycss2 \
python310-zopfli \
update-alternatives"

inherit rpm
