SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python311-simplebayes-1.5.8-2.32.noarch.rpm"
RPM_HASH = "109480cb7cd36cac6511cc4718bbbb6122d5f00411282a8ad863c09064038bbb091d76ff2409658bf232becbb4ac3d9def077a5e097e1ae52cff500e6cfb9140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(simplebayes) \
python311-simplebayes \
python3dist(simplebayes)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
