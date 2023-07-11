SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python311-freeipa-1.0.6-1.10.noarch.rpm"
RPM_HASH = "e592c7384146846ad5eeca03cde78d060c054cf8e96708add8995e1bd26e4cb9ecd9ea88e487c6fd079f27e2e3646671d313e4d1d743cf42ee5e279e632e4061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freeipa \
python3.11dist-python-freeipa \
python311-freeipa \
python3dist-python-freeipa"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
