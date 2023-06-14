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

RPM_NAME = "python39-canonicaljson-2.0.0-1.1.noarch.rpm"
RPM_HASH = "2ad17386e208359400466ea34abbdeb2dd958dae59bc1cd1d7b9ab28c7daf17442b6a59bf05841f1563fd866fd619b0df426afbc245a14ef65fc994f0a10e18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-canonicaljson \
python39-canonicaljson \
python3dist-canonicaljson"

RDEPENDS:${PN} += "python-abi \
python39-frozendict \
python39-simplejson \
python39-six \
python39-typing-extensions"

inherit rpm
