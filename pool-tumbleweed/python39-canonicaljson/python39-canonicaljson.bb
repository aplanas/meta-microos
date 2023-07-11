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

RPM_NAME = "python39-canonicaljson-2.0.0-2.3.noarch.rpm"
RPM_HASH = "16bfe1b6cc6a17589fe480df3b077401630dbf9633ce01bd3ca2303e25765d59c8a7cb767013d009d4155321161a849ca354aafe613bfa173405d0caa0d9eb5b"
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
