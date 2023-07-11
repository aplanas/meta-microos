SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python311-simplebayes-1.5.8-2.33.noarch.rpm"
RPM_HASH = "6fada044cd338061dfe987c2d53bed2fa90d36783d930ba9db2476378c33e8fe26495b0eee600a2f0b3504db966967b84d1e8ed37d2114fcd5287a6fe90176b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplebayes \
python3.11dist-simplebayes \
python311-simplebayes \
python3dist-simplebayes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
