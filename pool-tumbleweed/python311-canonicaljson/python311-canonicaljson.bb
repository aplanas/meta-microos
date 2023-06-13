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

RPM_NAME = "python311-canonicaljson-2.0.0-1.1.noarch.rpm"
RPM_HASH = "5b691e4bae0670fbe14599783bbaac8bd9a2ebcfaaf71b1f0e028618c53e18d538cdfaaa26a64be523c10f84d382660fdfbb6ff7d89afabebafe76787925626f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(canonicaljson) \
python311-canonicaljson \
python3dist(canonicaljson)"

RDEPENDS:${PN} += "python(abi) \
python311-frozendict \
python311-simplejson \
python311-six \
python311-typing_extensions"

inherit rpm
