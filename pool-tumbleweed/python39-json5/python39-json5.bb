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

RPM_NAME = "python39-json5-0.9.13-1.2.noarch.rpm"
RPM_HASH = "80372ec39a27dcbe895cf78ed1bb60066a92e77170eeb5aabe0fecb500372ec051e22c2f759422f6912e39ba22d05f97994f71e0b55f5e87af11fb1d82e4aef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(json5) \
python39-json5 \
python3dist(json5)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-setuptools"

inherit rpm
