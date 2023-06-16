SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-sure-2.0.0-3.5.noarch.rpm"
RPM_HASH = "275a864e52bef7afa0f29ebfcf1f1f6e05e6925c3057afac07544d81bca084c420e4d9105a1c04a7d5bc6889c8877d0fd6a9672daac1e054eeac56f5facdb08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sure \
python311-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
