SUMMARY = "Report exceptions, errors, and log messages to Rollbar"
DESCRIPTION = "Send messages and exceptions with arbitrary context, get back aggregates, and debug production issues quickly."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python311-rollbar-0.16.3-1.3.noarch.rpm"
RPM_HASH = "8a49cf0853655dc4acba4922b0c93f0c5964a91c30712e08d81b7bc0bcae3346b6c33adc3d41e0db6d592e576551d2f37be76b3afd9d218c0ceb29cb070f5792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rollbar) \
python311-rollbar \
python3dist(rollbar)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-requests \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
