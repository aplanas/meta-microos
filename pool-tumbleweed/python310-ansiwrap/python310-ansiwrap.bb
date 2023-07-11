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

RPM_NAME = "python310-ansiwrap-0.8.4-2.4.noarch.rpm"
RPM_HASH = "549e857700cc8b4f0d1381a7ba1a128808be12dc92d0b34ffe31380e146211c54e5b813560d935f4da32b15135f88a073f40d8366771523c8d2ef8f2646c3633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ansiwrap \
python310-ansiwrap \
python3dist-ansiwrap"

RDEPENDS:${PN} += "python-abi \
python310-textwrap3"

inherit rpm
