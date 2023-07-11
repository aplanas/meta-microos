SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-textile-4.0.2-1.11.aarch64.rpm"
RPM_HASH = "a90424ecc253085b016a705fc4789c5b79238eba3bd8d24f4e307dce8763dbc86287bb20bdcc62799fd786efa27ccc91ab162c780e50081691633e4c8b15279a"

RPROVIDES:${PN} += "python3-textile \
python3.11dist-textile \
python311-textile \
python3dist-textile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-html5lib \
python311-six \
update-alternatives"

inherit rpm
