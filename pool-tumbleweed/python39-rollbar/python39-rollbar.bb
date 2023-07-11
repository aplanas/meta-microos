SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python39-rollbar-0.16.3-1.5.noarch.rpm"
RPM_HASH = "4cecb09586d163d2ebb6ee730870324762262eebd7a53fe271fc253e8cca4d53c54239066f4a8575c3459a8551873b453e4d9f71c57e9d809864783ddace13b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rollbar \
python39-rollbar \
python3dist-rollbar"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-requests \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
