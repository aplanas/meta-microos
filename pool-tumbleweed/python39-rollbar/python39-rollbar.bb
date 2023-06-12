SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python39-rollbar-0.16.3-1.3.noarch.rpm"
RPM_HASH = "147d2222d959779a046978854f417d9010b602a3105555d758c0c9bb8d3a879fea5435a40a0b19fb229cb845e7066a2a6d4bf16002814d9887ff0bb0cbc0bc29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rollbar) \
python39-rollbar \
python3dist(rollbar)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-requests \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
