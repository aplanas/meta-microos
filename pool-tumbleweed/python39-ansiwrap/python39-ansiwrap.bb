SUMMARY = "Textwrap, but savvy to ANSI colors and styles"
DESCRIPTION = "Ansiwrap wraps text, like the standard textwrap module. \
But it also correctly wraps text that contains ANSI control \
sequences that colorize or style text. \
 \
Where textwrap is fooled by the raw string length of those control codes, \
ansiwrap is not; it understands that however much those codes affect color \
and display style, they have no logical length."
LICENSE = "Apache-2.0"

PV = "0.8.4"

RPM_NAME = "python39-ansiwrap-0.8.4-2.2.noarch.rpm"
RPM_HASH = "3b9d54bdc288b1f6a711467a69499e8d2e1bc3f4070fc9f7c52dc2c0bf1b6b33301dee81937ccccfa35309c5d8807d8761a27fe1208c3608b613d2035aff3bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansiwrap) \
python39-ansiwrap \
python3dist(ansiwrap)"
RDEPENDS:${PN} += "python(abi) \
python39-textwrap3"

inherit rpm
