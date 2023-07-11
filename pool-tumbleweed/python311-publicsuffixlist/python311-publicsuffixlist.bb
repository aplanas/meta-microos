SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python311-publicsuffixlist-0.9.1-1.4.noarch.rpm"
RPM_HASH = "92cd49f6f4a9025131fedaeeef73196f31ab7ca0a6bc226b63a1c4743c91af848f7537c36c385847c21ef97c7b328b171747233dc9fe4b3bb9d7791092aaf01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffixlist \
python3.11dist-publicsuffixlist \
python311-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
