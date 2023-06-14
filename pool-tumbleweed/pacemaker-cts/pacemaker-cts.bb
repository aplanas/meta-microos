SUMMARY = "Test framework for cluster-related technologies"
DESCRIPTION = "Test framework for cluster-related technologies like Pacemaker"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-cts-2.1.5+20230320.22590c566-1.1.noarch.rpm"
RPM_HASH = "e8b003d6f10e525bb1374bd322c71df64539f1a00158115f9c93d8efee5f8c07781c89a243519804d7cb996a5c386202b16a0184841131f40c8a19dcd6a52ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-cts"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3 \
pacemaker \
procps \
psmisc \
python-abi \
python3 \
python3-pacemaker \
python3-psutil"

inherit rpm
