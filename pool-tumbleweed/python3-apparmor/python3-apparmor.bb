SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "python3-apparmor-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "d3719f8fc6603ed5fbd5dd296c2fda7749cf335e736407e1b5ac9d922d914bddaf17c74f8f78ff25b91b396080d3618f4d82ff1cdf5f581d3942d721de5264ef"

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
