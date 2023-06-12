SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-datadiff-2.1.0-1.2.noarch.rpm"
RPM_HASH = "64d0a6938de151f1cace138895229582aa75b4480035f8b38bd8ec9ae7492204e120c91acd5c0265b894959793403e0f818ad8f409da42ab99c72cf306a9ee57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(datadiff) \
python39-datadiff \
python3dist(datadiff)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
