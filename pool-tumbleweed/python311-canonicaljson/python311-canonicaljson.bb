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

RPM_NAME = "python311-canonicaljson-2.0.0-2.3.noarch.rpm"
RPM_HASH = "3fc1c70b216e6af9fafa4b4fef895b5cb11b4ee3f51fe583b8f7b3928d4b10e0b245576bcae4df5e30d2653a905813b4b10e3131d2f5764aafc79ea9c3b078e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-canonicaljson \
python3.11dist-canonicaljson \
python311-canonicaljson \
python3dist-canonicaljson"

RDEPENDS:${PN} += "python-abi \
python311-frozendict \
python311-simplejson \
python311-six \
python311-typing-extensions"

inherit rpm
