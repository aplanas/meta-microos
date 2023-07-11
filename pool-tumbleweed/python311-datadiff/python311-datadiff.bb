SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-datadiff-2.1.0-1.4.noarch.rpm"
RPM_HASH = "c412b8188edfd44ad9b1f09a25ecde5986818136ae7930b10f09d303a6808107f1d0eed99da7c8add816b359450cd4335ad12ecbf8cccc4864268d7f17c4c472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datadiff \
python3.11dist-datadiff \
python311-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
