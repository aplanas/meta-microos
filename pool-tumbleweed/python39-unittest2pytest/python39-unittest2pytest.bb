SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python39-unittest2pytest-0.4-1.15.noarch.rpm"
RPM_HASH = "c411889d602fe137abb126f71aad74879263893eb138d034c2a01ee75f96bf3a1137b17454585c7a1b307fc413ca981019474968927f417417939a20025b92ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unittest2pytest \
python39-unittest2pytest \
python3dist-unittest2pytest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
