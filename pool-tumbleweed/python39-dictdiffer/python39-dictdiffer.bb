SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-dictdiffer-0.9.0-2.6.noarch.rpm"
RPM_HASH = "c95735e9666d90df6f67628a9ee3450a52378426b3e96b3effaa0b2464ea48b60dbe12d6d9710f879cfdb7f8b0750eb3c6abb5445549098bfe4a184387c6d37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dictdiffer) \
python39-dictdiffer \
python3dist(dictdiffer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
