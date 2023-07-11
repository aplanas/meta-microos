SUMMARY = "Extra features for Python's JSON"
DESCRIPTION = "The json_tricks package brings several pieces of functionality to \
python handling of json files: \
 \
1. Store and load numpy arrays in human-readable format. \
2. Store and load class instances both generic and customized. \
3. Store and load date/times as a dictionary (including timezone). \
4. Preserve map order {} using OrderedDict. \
5. Allow for comments in json files by starting lines with #. \
6. Sets, complex numbers, Decimal, Fraction, enums, compression, duplicate keys, ... \
 \
As well as compression and disallowing duplicate keys."
LICENSE = "BSD-3-Clause"

PV = "3.17.1"

RPM_NAME = "python39-json_tricks-3.17.1-1.1.noarch.rpm"
RPM_HASH = "8dc6f5843e6bf2393d5cbcfe11ac4653ed62cd56193c2082dd43630c06f93a84725f5fc1543972123a574238d2b05646f02225cb3511165a31ac1385ef8fa8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-json-tricks \
python39-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
