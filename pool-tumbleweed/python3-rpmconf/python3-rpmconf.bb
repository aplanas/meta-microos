SUMMARY = "Python interface for rpmconf"
DESCRIPTION = "Python interface for rpmconf and an essential part of rpmconf."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "python3-rpmconf-1.1.8-1.2.noarch.rpm"
RPM_HASH = "5fe97a21b02d1f0b1e29f787e2f4cd4c96b45f65a4fc0b644b9b02093f5f38cc98c9b9a25af0e339f739f4b6848fb91f15ed0d08ce7cbcf371a4e021180e0a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmconf \
python3.10dist(rpmconf) \
python3dist(rpmconf)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
