SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python310-textile-4.0.2-1.11.aarch64.rpm"
RPM_HASH = "1db1e67fb138e6bb524ea227ddab4358f53490d6a2d07de3fc30990ada0dcb24e4490f3c670ffd139679e149a2ffbd26a9ec2b29c07f493345bfe4e9e67df479"

RPROVIDES:${PN} += "python3.10dist-textile \
python310-textile \
python3dist-textile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-html5lib \
python310-six \
update-alternatives"

inherit rpm
