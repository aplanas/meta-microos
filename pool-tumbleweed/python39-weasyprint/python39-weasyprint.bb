SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "56.1"

RPM_NAME = "python39-weasyprint-56.1-1.4.noarch.rpm"
RPM_HASH = "cb3f76d019165b53495116009ab3eb47f699cf79a1b84da6f0fdd808f980f9732c97626224443d0a3925ef4b2504b410ca6945f4fb7792e24f3c8e4c0bae210a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(weasyprint) \
python39-WeasyPrint \
python39-weasyprint \
python3dist(weasyprint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
libgobject-2_0-0 \
pango \
python(abi) \
python39-Brotli \
python39-FontTools \
python39-Pillow \
python39-Pyphen \
python39-base \
python39-cffi \
python39-cssselect2 \
python39-html5lib \
python39-pydyf \
python39-tinycss2 \
python39-zopfli \
update-alternatives"

inherit rpm
