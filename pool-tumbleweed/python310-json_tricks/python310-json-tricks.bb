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

RPM_NAME = "python310-json_tricks-3.17.1-1.1.noarch.rpm"
RPM_HASH = "4a8e2c05c309bb23b0cd2002459993c0807af97db60b23dfed9fade3609cd2a2684a310149024c64f589a85aa9f2e7cdcb8ff309fecc18c7a91968caa0ba640b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-json-tricks \
python310-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
