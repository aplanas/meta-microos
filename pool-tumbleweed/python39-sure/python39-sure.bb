SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-sure-2.0.0-4.1.noarch.rpm"
RPM_HASH = "6fb70226b9267daa11a4eba8dfaffc19e674e08dcf84b58a962f86e0840bb9bab3d6b2332221b90da85a56f09db1317b766e369fa9684fbecc536880917f377c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sure \
python39-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
