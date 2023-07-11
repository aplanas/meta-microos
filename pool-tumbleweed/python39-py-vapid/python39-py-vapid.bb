SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python39-py-vapid-1.9.0-1.6.noarch.rpm"
RPM_HASH = "cd848256392715864885855fb6540bc8dbcd44652e6f56cc85fd2aba93f9eab3468c977479c5ee2707d0f10d3c03eb1262ef6d76c3f097f287e39f2f80010531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-vapid \
python39-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
update-alternatives"

inherit rpm
