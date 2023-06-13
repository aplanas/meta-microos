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

RPM_NAME = "python311-ansiwrap-0.8.4-2.2.noarch.rpm"
RPM_HASH = "8cfbe762874fa165cb3cc11fd60f93d8b1d43b45b8684caca53a67e03f25c78734357a99c77ad2a38eecd904a8b6c9457f96eb36c59a24d360aaa4c1edcf5802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ansiwrap) \
python311-ansiwrap \
python3dist(ansiwrap)"

RDEPENDS:${PN} += "python(abi) \
python311-textwrap3"

inherit rpm
