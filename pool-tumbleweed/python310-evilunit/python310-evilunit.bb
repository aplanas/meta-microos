SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-evilunit-0.2.1-1.14.noarch.rpm"
RPM_HASH = "82abc208b44294620b2d4004f28b1f7f4b8ef5135cd26c74e79d37bf1de069a0213cf2ea84b2370f58084fb6fba6024d458592cc831332bea2adc8cc24c161fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-evilunit \
python310-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
