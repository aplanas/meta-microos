SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python310-gear-0.16.0-1.6.noarch.rpm"
RPM_HASH = "00a79a486169f9b649f0edaf95b882009b3b166cec56eb04d1d7379114f19f83c88acb6b5b75acc9b300aad2cd8129293082e296c873d445080d12260e9c78fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gear \
python310-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-extras \
python310-pbr \
python310-python-daemon \
python310-six \
update-alternatives"

inherit rpm
