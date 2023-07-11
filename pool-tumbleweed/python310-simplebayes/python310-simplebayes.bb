SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python310-simplebayes-1.5.8-2.33.noarch.rpm"
RPM_HASH = "06cf5aedea6daf7a31655508fd41e1620746447a502ce19b69fd7dc562866460aa9f07c0a52dee3726ea7a880f578c9adca15bdcd6b7bbd4b22890287639465b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-simplebayes \
python310-simplebayes \
python3dist-simplebayes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
