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

RPM_NAME = "python39-ansiwrap-0.8.4-2.4.noarch.rpm"
RPM_HASH = "93c55dc29726fe4164b21b14fc9018e8a8522a04c2641b3da885bd9f7392a3119b79d52b9f6bf5e22b11983460ad70d4149e8adb798b3ad9f144f54c68c6b202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ansiwrap \
python39-ansiwrap \
python3dist-ansiwrap"

RDEPENDS:${PN} += "python-abi \
python39-textwrap3"

inherit rpm
