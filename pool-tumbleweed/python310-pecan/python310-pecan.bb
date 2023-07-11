SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-pecan-1.4.2-3.3.noarch.rpm"
RPM_HASH = "6dc50497b0b4a24b17809853a6df39a341a0715a9d74f7fae405998d5ff9d0e9fda39fac5c5d763f9331c7baeb1068c14361b5f499c16081c2d901e2cb2c6daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pecan \
python310-pecan \
python3dist-pecan"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-Mako \
python310-WebOb \
python310-WebTest \
python310-logutils \
python310-setuptools"

inherit rpm
