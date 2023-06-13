SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python310-textile-4.0.2-1.9.aarch64.rpm"
RPM_HASH = "9f0520beb7ad90b6177d6a6952a6a618cccc2442bb0e4f4bf04e6b48f6c189a1242e26b788499ccd732dac7a784fec23f8cc9594cdf6a893175acb8eb714d176"

RPROVIDES:${PN} += "python3-textile \
python3.10dist(textile) \
python310-textile \
python310-textile(aarch-64) \
python3dist(textile)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Pillow \
python310-html5lib \
python310-six \
update-alternatives"

inherit rpm
