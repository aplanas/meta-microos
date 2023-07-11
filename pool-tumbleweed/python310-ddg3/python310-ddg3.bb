SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python310-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.14.noarch.rpm"
RPM_HASH = "06562bdc0b7560284089efbca65ed77589d77708916d225139c01b6dadda9f84fe8338a36a1f0b7c8171c5b511a4db443538f3ac5713485e3824a9bfc9bd6f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ddg3 \
python310-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-requests \
update-alternatives"

inherit rpm
