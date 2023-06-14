SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-datadiff-2.1.0-1.2.noarch.rpm"
RPM_HASH = "dce5325ef6adb931273d4683d1ad87268c7065abb6652b4fd521ace0ed1e00177c22f267978953f2cfda565fb9d6598e44ab8f6c51cb8bb37d0b08515abeb79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datadiff \
python3.10dist-datadiff \
python310-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
