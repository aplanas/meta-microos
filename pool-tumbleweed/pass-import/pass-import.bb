SUMMARY = "A pass extension for importing data from most of the existing password manager"
DESCRIPTION = "A pass extension for importing data from most of the existing password manager."
LICENSE = "GPL-3.0-only"

PV = "3.3"

RPM_NAME = "pass-import-3.3-1.4.noarch.rpm"
RPM_HASH = "165f4be8fb565c2f5e645b90c540a103966c40f3cfbe347a7b930045ce6c3dfbcf31c1e6f9fe8180a6a923eeca63bcc3d9174a449fc5b95c9467e1fb93d6792d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-import \
python3.10dist(pass-import) \
python3dist(pass-import)"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python(abi) \
python3-PyYAML"

inherit rpm
