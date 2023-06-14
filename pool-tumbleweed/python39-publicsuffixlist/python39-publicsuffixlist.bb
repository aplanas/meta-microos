SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "0.9.1"

RPM_NAME = "python39-publicsuffixlist-0.9.1-1.3.noarch.rpm"
RPM_HASH = "f15a57c1120d76f32d3d3f89aaf0c5eebcf797a874327310652cffb47b45b6eb3170a79605384f84eebd85be9595e4f3f33a6c06e0a7632fd31a835103b296f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-publicsuffixlist \
python39-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
