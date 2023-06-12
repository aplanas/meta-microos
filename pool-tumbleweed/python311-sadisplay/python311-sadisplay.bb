SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python311-sadisplay-0.4.9-2.17.noarch.rpm"
RPM_HASH = "956c7f6d38a097895fd8e71e00e4499db6df2491ae2dce12b8184359ce5541ff6556d48459981645cf1d25a099092017ec193af45b352e55637806000e504c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sadisplay) \
python311-sadisplay \
python3dist(sadisplay)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-SQLAlchemy \
update-alternatives"

inherit rpm
