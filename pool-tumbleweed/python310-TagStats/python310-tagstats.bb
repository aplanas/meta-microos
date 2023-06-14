SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-TagStats-0.1.2-4.13.noarch.rpm"
RPM_HASH = "7a279206695d0f14dd77160a1ffb5617a22901425ccb9fae7e0ae4a631f42aee3da4eaea062bbd3f3450349c07931fcf677c679ae75f00e57e212b1ced377008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TagStats \
python3.10dist-tagstats \
python310-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
