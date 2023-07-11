SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python310-rollbar-0.16.3-1.5.noarch.rpm"
RPM_HASH = "9e63829ec9277b11cc0b8ce0987aaa603df2e50f0618fe7c45e18e67f1bd5827a1595493dee423f4c98f2e15875fa7acc727703c9f0600ab011c062867db9664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rollbar \
python310-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-requests \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
