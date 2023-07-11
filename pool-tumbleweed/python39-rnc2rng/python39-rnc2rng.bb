SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python39-rnc2rng-2.6.6-1.13.noarch.rpm"
RPM_HASH = "8bf2142a10d6121577b7b2cba2141fb181a023b24b09840ffec3b8f0895f2d6cd0468be51a2e005cb6ab54d8e41b04d6ba2d0adb11d62b48ed8cff992dd6e7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rnc2rng \
python39-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-rply \
update-alternatives"

inherit rpm
