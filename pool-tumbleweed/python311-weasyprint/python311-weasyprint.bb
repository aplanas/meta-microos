SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "56.1"

RPM_NAME = "python311-weasyprint-56.1-1.4.noarch.rpm"
RPM_HASH = "8fc72bbd22f5361d35a02b8395a0c4274b98b71d8edfdf091da3ab8e768cf2bb2ca452c3d5780f62f7b87ac7f395cb6b7fa563975e330d1aace55fc3ca8d7abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-weasyprint \
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
