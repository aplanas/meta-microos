SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python310-rollbar-0.16.3-1.3.noarch.rpm"
RPM_HASH = "68eb46fb98c81dd71553e7aa2ca3f6a31ec13ac81d60dd29ecf478fb753a1a978ecacd7aa99e565346dcfc61149e03990a0aa38832481f8673d3499ae3906381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rollbar \
python3.10dist-rollbar \
python310-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-requests \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
