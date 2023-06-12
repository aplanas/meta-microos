SUMMARY = "Test scripts for Booth"
DESCRIPTION = "This package contains automated tests for Booth, \
the Cluster Ticket Manager for Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+20221117.9d4029a"

RPM_NAME = "booth-test-1.0+20221117.9d4029a-1.1.aarch64.rpm"
RPM_HASH = "ac926abedc5d94033981e4417540a7324f95c168ba81d5c4d94312d4e8ae3ce863586ac845882e0ffe0e0b603bcda24c2ba5cfbffc59d5b6a481e93058f0efbd"

RPROVIDES:${PN} += "booth-test booth-test(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh booth python3"

inherit rpm
