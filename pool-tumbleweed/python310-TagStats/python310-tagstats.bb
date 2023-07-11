SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-TagStats-0.1.2-4.15.noarch.rpm"
RPM_HASH = "ecc558ae6748fec89b1d2f73774733736c1b143ce4c067e115816da1f6306da6cb783daa4d9d314fc04deb5f14682a58bffc5a88ffdf940a5189770700c7278e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tagstats \
python310-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
