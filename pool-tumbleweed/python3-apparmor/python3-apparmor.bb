SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "python3-apparmor-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "a9e72c2217123e80bf200cfcef7da32fc07e77230bafe0d30daa5454cf1a86550dbb2d2221856214c1af5097531bc5f0c15d75c8f186460b9b89a85d0f57bd0c"

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
