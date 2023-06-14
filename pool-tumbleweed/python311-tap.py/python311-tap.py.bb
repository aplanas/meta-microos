SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python311-tap.py-3.1-1.6.noarch.rpm"
RPM_HASH = "3c26429116da90b6c3644c889c261af159010a3a0cba1da9d0d1a67008b63b840f77ec73361a540c034f6031003b990f168290a37772520127cbfe8369453151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tap.py \
python311-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
