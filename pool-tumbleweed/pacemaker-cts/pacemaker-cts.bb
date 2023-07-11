SUMMARY = "Test framework for cluster-related technologies"
DESCRIPTION = "Test framework for cluster-related technologies like Pacemaker"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-cts-2.1.6+20230524.6fdc9deea-1.1.noarch.rpm"
RPM_HASH = "ded140b47714d392bc5458aa0aac6cbdd7addc220b1aea55fbdeb7c25ded1803684f4edf684781ed52901ddfe09d7d9eb840792d5f8fba1848246cec8f4c7d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-cts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
pacemaker \
procps \
psmisc \
python-abi \
python3 \
python3-pacemaker \
python3-psutil"

inherit rpm
