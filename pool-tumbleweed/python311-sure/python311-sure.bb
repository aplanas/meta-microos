SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-sure-2.0.0-4.1.noarch.rpm"
RPM_HASH = "85ad41bfbc96f19e776255995819a347bf76790296aa5d5059fd6771f4d1edfdd33cafbd5e74593175adfb7355d29f91381ac4c125d3c82ec28641ff7deea340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sure \
python3.11dist-sure \
python311-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
