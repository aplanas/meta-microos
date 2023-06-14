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

PV = "3.16.1"

RPM_NAME = "python310-json_tricks-3.16.1-1.1.noarch.rpm"
RPM_HASH = "552c6099f6ac725a4d71ff08ab3e204b04de7e2d1a88687c0c281a3b50cf5fed740844c4e5c7fac48534b13ffd9b21f29c0d56b860c341735d8e2ea68acb74dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-tricks \
python3.10dist-json-tricks \
python310-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
