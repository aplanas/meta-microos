SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "python3-apparmor-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "eecb2087958968e7e96c49ef2da1593524363745cc670c763e38c62dc04feb4b3be3a099164785410bba2b61ad4a130cfa1b20ba3602b471163ad13d66c62380"

RPROVIDES:${PN} += "python3-apparmor \
python3.11dist-apparmor \
python3.11dist-libapparmor \
python3dist-apparmor \
python3dist-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
libm.so.6 \
python-abi \
python3"

inherit rpm
