SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python311-unittest2pytest-0.4-1.15.noarch.rpm"
RPM_HASH = "f606127715b9641812e7965373521cd2a30230fa13ea7b44ec66baef83819962433ed082ec2336389363a3be1ed090069786122317585a8264bb40ccc066b7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest2pytest \
python3.11dist-unittest2pytest \
python311-unittest2pytest \
python3dist-unittest2pytest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
