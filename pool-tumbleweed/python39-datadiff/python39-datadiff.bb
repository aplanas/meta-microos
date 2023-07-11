SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-datadiff-2.1.0-1.4.noarch.rpm"
RPM_HASH = "ce7b2ccda1edf8dbcf42288488ef056dd9dc8d58afc04f56d4c8d6002a6ffea6b88478a2c5127bee733177503e9a0d6e14a3dcd064b8ca4de808dfec7e5bd423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datadiff \
python39-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
