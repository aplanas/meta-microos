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

RPM_NAME = "python310-canonicaljson-2.0.0-1.1.noarch.rpm"
RPM_HASH = "955af6ab0508185594081ae1cfd8d7d18fc985fa604d1a262240f344cf47c8db0109c7dabfb08eed6905bfe6c892d8d8cf38e9d395032ffc4ac630d5d34c0845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-canonicaljson \
python3.10dist(canonicaljson) \
python310-canonicaljson \
python3dist(canonicaljson)"

RDEPENDS:${PN} += "python(abi) \
python310-frozendict \
python310-simplejson \
python310-six \
python310-typing_extensions"

inherit rpm
