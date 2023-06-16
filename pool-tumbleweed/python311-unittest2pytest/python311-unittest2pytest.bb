SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python311-unittest2pytest-0.4-1.13.noarch.rpm"
RPM_HASH = "68d3b589ff3015b26b2e73fa45339201d4a9a0cf34492e98afbedab0434a48171b7be6fd9f50d1e46372fc1a1d02725db5974e0ac50302bcd3197fd0b0986b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-unittest2pytest \
python311-unittest2pytest \
python3dist-unittest2pytest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
