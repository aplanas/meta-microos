SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-sure-2.0.0-3.5.noarch.rpm"
RPM_HASH = "f36c4ff3b505a2c6280d2a5eace9374ed2c01678eadbb0748efe29ab9c11a41cd28684c183f74e16fac65dded78388d1131f7f3d0c4ffec7dcb6b7f9c5305d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sure \
python39-sure \
python3dist-sure"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-six \
update-alternatives"

inherit rpm
