SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python311-rollbar-0.16.3-1.5.noarch.rpm"
RPM_HASH = "2543745d0baf089ba9134ef5cd2f4095e91a8b4c161aec125958b8394f586e19786a8df186e41845207860e58401906aac81deed13c90b335b8b8cb2e96e3a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rollbar \
python3.11dist-rollbar \
python311-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
