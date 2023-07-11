SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python310-suntime-1.2.5-1.16.noarch.rpm"
RPM_HASH = "b894f0bb437b766570cad51c66f04b82e2f25f11d65072d4fb17ba0f479c763deb1f0b22ef88f8e8f98e8c60b6212fef77d05d53001f546837fa1915c0dfce7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-suntime \
python310-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
