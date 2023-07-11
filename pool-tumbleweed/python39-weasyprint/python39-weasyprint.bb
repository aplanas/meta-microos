SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "59.0"

RPM_NAME = "python39-weasyprint-59.0-2.1.noarch.rpm"
RPM_HASH = "20b4f308b6224c7d455c84d465806adf5539b5eca23ef91ae5d361a27ad4ed3dba8af1317ac32d8161c606c553f646b18b326c6657103d0b5583fade8111f974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-weasyprint \
python39-WeasyPrint \
python39-weasyprint \
python3dist-weasyprint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
libgobject-2-0-0 \
pango \
python-abi \
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
