SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python311-technicolor-2017.1.16.1544-3.15.noarch.rpm"
RPM_HASH = "991212ebed53bf3d79359f3236d8bdbf879dc322a83be95c1a8bde37fe8ee5f02082a961d0c0ad9b77b3879dfe47e9179a6f89b20154e7f5481160b84f06e1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-technicolor \
python3.11dist-technicolor \
python311-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
