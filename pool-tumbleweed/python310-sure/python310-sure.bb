SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-sure-2.0.0-4.1.noarch.rpm"
RPM_HASH = "09013f82e343447cf3a6853331e3000987cf810ae9b500bbae2c307808dee7edb49ce8bfd4f768b97183891c51556b65f76353a1009ed2040938ebd8e8003cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sure \
python310-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
