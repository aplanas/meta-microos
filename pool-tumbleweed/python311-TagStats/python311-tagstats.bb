SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-TagStats-0.1.2-4.13.noarch.rpm"
RPM_HASH = "b66123023d891d20d285ac4622dfc22f5bc096f81c0a3b8d4322147e39481b7e3796c7bba995b1eef94801dd3ed44f5dacc2b16de8e091bc801b9f1b700b1f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tagstats \
python311-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
