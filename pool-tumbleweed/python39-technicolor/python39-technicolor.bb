SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python39-technicolor-2017.1.16.1544-3.15.noarch.rpm"
RPM_HASH = "caf83a61e82a613b1e64fb3f44be5207d55ec58a8cc45b031f4ef47124858524e66038f00bcfc1f3f78d72719de782649409704d6893bf352720b5ec7a78984a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-technicolor \
python39-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
