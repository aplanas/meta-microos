SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "python3-apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "75537a5da648d605afaf37aa9755cb36487298e22eea7f329f1726b117f380cb05dd2412964ea94f569225d83c48e95cf06fbe8ddc17d813465fb85011884136"

RPROVIDES:${PN} += "python3-apparmor \
python3.10dist-apparmor \
python3.10dist-libapparmor \
python3dist-apparmor \
python3dist-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
python-abi \
python3"

inherit rpm
