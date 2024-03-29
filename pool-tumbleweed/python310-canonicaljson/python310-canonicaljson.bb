SUMMARY = "Canonical JSON for Python"
DESCRIPTION = "This is a Python module which encodes objects and arrays into JSON as per \
RFC 7159. \
 \
* Sorts object keys so that it yields the same result each time. \
* Has no insignificant whitespace to make the output as small as possible. \
* Escapes only the characters that must be escaped, U+0000 to U+0019 / \
  U+0022 / U+0056, to keep the output as small as possible. \
* Uses the shortest escape sequence for each escaped character. \
* Encodes the JSON as UTF-8. \
* Can encode frozendict immutable dictionaries."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python310-canonicaljson-2.0.0-2.3.noarch.rpm"
RPM_HASH = "5048b35454289d2219c2e986cf381ffe8e9975c901fac2b1b09c3094ca57b3c66e5c7bcc3288430425f2d34bdc36cd6f8653770c276cd79534b5b882f0a27d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-canonicaljson \
python310-canonicaljson \
python3dist-canonicaljson"

RDEPENDS:${PN} += "python-abi \
python310-frozendict \
python310-simplejson \
python310-six \
python310-typing-extensions"

inherit rpm
