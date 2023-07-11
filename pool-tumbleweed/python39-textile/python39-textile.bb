SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python39-textile-4.0.2-1.11.aarch64.rpm"
RPM_HASH = "b49da68b12d4b3806deefb84635d323fa4e7627d4402830cc4bf713b2d72553aba5f11ff0900b091bb6aeb792ad7c893cee735b7702e66c55073c12396a234f7"

RPROVIDES:${PN} += "python3.9dist-textile \
python39-textile \
python3dist-textile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-html5lib \
python39-six \
update-alternatives"

inherit rpm
