SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python310-py-vapid-1.9.0-1.4.noarch.rpm"
RPM_HASH = "c4b042d88e0ba095021c9f2e7585ad054e179715094cef4c6c3f364979afc851be45e8e555f3e2923372f56fac414b588cef12e0be304d2689d40d83dd6a1a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-vapid \
python3.10dist(py-vapid) \
python310-py-vapid \
python3dist(py-vapid)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-cryptography \
update-alternatives"

inherit rpm
