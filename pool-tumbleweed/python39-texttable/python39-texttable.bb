SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python39-texttable-1.6.7-2.1.noarch.rpm"
RPM_HASH = "308dad9807311bdba7881cafbc4605f48c183dfc3874d3826611a2553fadeefa657f5f4e124f83d0d9ea89d4ceb5f3f6e1c2ef8a0055a843a14db3ea8313e695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-texttable \
python39-texttable \
python3dist-texttable"

RDEPENDS:${PN} += "python-abi \
python39-base"

inherit rpm
