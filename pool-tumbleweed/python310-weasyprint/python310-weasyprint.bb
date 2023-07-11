SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "59.0"

RPM_NAME = "python310-weasyprint-59.0-2.1.noarch.rpm"
RPM_HASH = "4a6d888bef69b50b747fa19373f10663b5bd1a2504dd0fd385007ac6847b3238a17231d4c871a0640f1211de2ecf5702cb8a3c1dc811bbe20fea9cf773e22361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-weasyprint \
python310-WeasyPrint \
python310-weasyprint \
python3dist-weasyprint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
libgobject-2-0-0 \
pango \
python-abi \
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
