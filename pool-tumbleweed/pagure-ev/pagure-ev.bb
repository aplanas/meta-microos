SUMMARY = "EventSource server for pagure"
DESCRIPTION = "Pagure comes with an eventsource server allowing live update of the pages \
supporting it. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-ev-5.13.3-1.4.noarch.rpm"
RPM_HASH = "7d5fe88598dc0483b818c54ea679e6aa4c20771faa697615b80be75ffe325f876b52ef95559d6cd2a86f783a01839a540749db58d154a9e571f9b2cb668b43a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ev"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
pagure \
python3-Trololio \
systemd"

inherit rpm
