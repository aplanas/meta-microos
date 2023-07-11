SUMMARY = "A Python implementation of the JSON5 data format"
DESCRIPTION = "A Python implementation of the JSON5 data format. \
 \
JSON5 extends the JSON data interchange format to make it \
slightly more usable as a configuration language: \
 \
  * JavaScript-style comments (both single and multi-line) are legal. \
  * Object keys may be unquoted if they are legal ECMAScript identifiers \
  * Objects and arrays may end with trailing commas. \
  * Strings can be single-quoted, and multi-line string literals are allowed."
LICENSE = "Apache-2.0"

PV = "0.9.13"

RPM_NAME = "python311-json5-0.9.13-1.4.noarch.rpm"
RPM_HASH = "25e09c8e2ba9c1652472e3a13d1f85780067ba7dd0c86e5a85623f8f6e3bd1f0e12e9afe289a4c0b9739a094eff4edf708f725b1a43bfe60e87e23ace92e607e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json5 \
python3.11dist-json5 \
python311-json5 \
python3dist-json5"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-setuptools"

inherit rpm
