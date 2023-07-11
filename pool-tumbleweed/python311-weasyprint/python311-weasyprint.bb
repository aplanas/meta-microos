SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "59.0"

RPM_NAME = "python311-weasyprint-59.0-2.1.noarch.rpm"
RPM_HASH = "5a726cce3e73a509cf88e665196500b4f97c46dd6d967ed398d17cc78367d2c1b47885bea3436bb310d290a7a5a92d782ee2c4d1b33afdd5f13c199cd91183f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WeasyPrint \
python3-weasyprint \
python3.11dist-weasyprint \
python311-WeasyPrint \
python311-weasyprint \
python3dist-weasyprint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
libgobject-2-0-0 \
pango \
python-abi \
python311-Brotli \
python311-FontTools \
python311-Pillow \
python311-Pyphen \
python311-base \
python311-cffi \
python311-cssselect2 \
python311-html5lib \
python311-pydyf \
python311-tinycss2 \
python311-zopfli \
update-alternatives"

inherit rpm
