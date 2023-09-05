SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "python3-apparmor-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "0426b2a35d2397d275381d5ea4beebeda2ec64374f0fd2f4e528adfb54be282b9083c3ebed7ea25ce4a8e8ea929c652d8c6c7a29d7ff468e9b33c589a3abeb21"

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
