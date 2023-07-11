SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-datadiff-2.1.0-1.4.noarch.rpm"
RPM_HASH = "177db039b6b50382ff2b1fb6981cd2e92c7756a4cc39fe51ef68c2b6f10932ed91349ea7e6dac92184afafcaa4b7f18341e3038d4b112dee2825a8445f07f1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datadiff \
python310-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
