SUMMARY = "A Media Center designed to run on a large number of devices"
DESCRIPTION = " \
EpyMC is a Media Center application written in python that use the Enlightenment Foundation Library as \
the living base."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "epymc-1.2.0-2.18.noarch.rpm"
RPM_HASH = "1208fd6b7bdc4f4e23cacef5db90ee8765d9b46856ff0ba98272b0d013ffb7d85519068b6d11968ab3bc63233c38c83a0a162378c1e89d91c22772bfb38ae588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epymc \
python3.10dist-epymc \
python3dist-epymc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
python-abi \
python3-efl"

inherit rpm
