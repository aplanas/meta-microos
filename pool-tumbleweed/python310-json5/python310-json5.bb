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

RPM_NAME = "python310-json5-0.9.13-1.2.noarch.rpm"
RPM_HASH = "696f32cf955028dba45fdeff2e30e02e62d65b5cb6ed1696c1288a329d85ef5f609c55e5c43e90ccf58987226ced52808851201d1e0bc133e5bfb3859e28c3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json5 \
python3.10dist(json5) \
python310-json5 \
python3dist(json5)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-setuptools"

inherit rpm
