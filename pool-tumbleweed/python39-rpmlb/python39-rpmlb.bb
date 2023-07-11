SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python39-rpmlb-1.1.1-1.14.noarch.rpm"
RPM_HASH = "bd41e5d5ae097bf4a80dbeb5c019a72965f68bce5c3da40515af2699165ab841c8ae0c8e95c7303ebd7f8cd0666324d6f2a642e5d6b297642ee17aa4e8d73b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpmlb \
python39-rpmlb \
python3dist-rpmlb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
python39-retry"

inherit rpm
