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

RPM_NAME = "python310-json5-0.9.13-1.4.noarch.rpm"
RPM_HASH = "8908157237eb6dfa62c4d34161fa683d4c9c1a6ed0229bf652e640e06d5c21a76dd868865e174823c4448b982558dc7b488137a605ca3c00e5a18b2f23633b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-json5 \
python310-json5 \
python3dist-json5"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-setuptools"

inherit rpm
