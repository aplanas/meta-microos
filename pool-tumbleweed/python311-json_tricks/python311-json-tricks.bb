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

RPM_NAME = "python311-json_tricks-3.17.1-1.1.noarch.rpm"
RPM_HASH = "64c853ebb2a6765711254bc0a43ff057dc4f303f15d71afaccf2868590adddab22b03b5116318696d0ece21e02cce30772b257a4dc4de27cd93161ee45e45a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-tricks \
python3.11dist-json-tricks \
python311-json-tricks \
python3dist-json-tricks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
