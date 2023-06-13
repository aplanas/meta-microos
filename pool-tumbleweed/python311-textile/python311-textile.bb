SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-textile-4.0.2-1.9.aarch64.rpm"
RPM_HASH = "837f51e22ae28ae040e1a91907243e55985f424524f16a40ac0fcbb588308376a83f07c494f0c6535f495e2e053774ca6dbb5635c03a8715b91882c662dd2c15"

RPROVIDES:${PN} += "python3.11dist(textile) \
python311-textile \
python311-textile(aarch-64) \
python3dist(textile)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Pillow \
python311-html5lib \
python311-six \
update-alternatives"

inherit rpm
