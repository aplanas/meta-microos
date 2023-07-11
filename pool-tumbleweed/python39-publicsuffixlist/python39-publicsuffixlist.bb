SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python39-publicsuffixlist-0.9.1-1.4.noarch.rpm"
RPM_HASH = "c9da6834366e02b9ecdc60f71eaf93582e449905347315f7012b2663da4ea29cf326657783cbed59b4be1c5a2f4924dad90a029ce4d421d6a488464c468ec787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-publicsuffixlist \
python39-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
