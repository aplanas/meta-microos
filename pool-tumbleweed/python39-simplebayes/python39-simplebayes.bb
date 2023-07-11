SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python39-simplebayes-1.5.8-2.33.noarch.rpm"
RPM_HASH = "cdb778a629cad434e7dcfb24ee584d7c39d3cbb0bd8b319deade7e9099f2e27b1f1a9f1f82573b470006d61f710cfdb31751d7db3a4f5f9f4f06b84b63a89dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-simplebayes \
python39-simplebayes \
python3dist-simplebayes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
