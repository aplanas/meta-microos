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

RPM_NAME = "python311-ansiwrap-0.8.4-2.4.noarch.rpm"
RPM_HASH = "2d7ac0e8fb75f8702a5d7b8a74c523ce5f82be1159e635cf13bee248abf8ac9f745c9aa7e9699b47f2627dc99d95b0f0a5ca4b77edc3b78360eda1567aed6695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansiwrap \
python3.11dist-ansiwrap \
python311-ansiwrap \
python3dist-ansiwrap"

RDEPENDS:${PN} += "python-abi \
python311-textwrap3"

inherit rpm
