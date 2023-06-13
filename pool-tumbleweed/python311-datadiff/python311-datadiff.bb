SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-datadiff-2.1.0-1.2.noarch.rpm"
RPM_HASH = "3000d777d1c2a4ec700e279d51dc06b102cbecec0d9dd4317428c817541c28969724cc704e5ebd3ca206ba2f7163387c06ebc75d1c8e461b88f8ed0e96ced5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(datadiff) \
python311-datadiff \
python3dist(datadiff)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
