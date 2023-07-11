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

RPM_NAME = "python39-json5-0.9.13-1.4.noarch.rpm"
RPM_HASH = "ce350b47da959977f01aba9053843f282601de853edabc95aee39c7ba40729b8cccfb45e4408e834840105cd5925a5e114090300f75810b1df159b03823a63ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-json5 \
python39-json5 \
python3dist-json5"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-setuptools"

inherit rpm
