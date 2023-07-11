SUMMARY = "Statistics for each tag's set of key phrases"
DESCRIPTION = "A module to compute the statistics of each tag's set of key phrases \
over input lines in Python 3."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-TagStats-0.1.2-4.15.noarch.rpm"
RPM_HASH = "ea79f004c1a4a83e000a095719282ce5d82282d3da0339a29aa7f0713cf0dbdac89ae50fb35fefbf7688eeb7f2a962f763c95acccae5b675b038c06db65a7af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TagStats \
python3.11dist-tagstats \
python311-TagStats \
python3dist-tagstats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
