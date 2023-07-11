SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python310-publicsuffixlist-0.9.1-1.4.noarch.rpm"
RPM_HASH = "3becd029a2209cf3ae4bbbc953fb40ea74c3dada90845319871815b4589eb74fdfae6712d4d9af58588cb2503f9fd8c6ded3b04445195edf304934df5cef404c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-publicsuffixlist \
python310-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
