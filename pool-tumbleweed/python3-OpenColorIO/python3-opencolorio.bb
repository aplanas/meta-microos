SUMMARY = "Python Bindings for OpenColorIO"
DESCRIPTION = "This package contains python bindings for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python3-OpenColorIO-2.1.2-3.1.aarch64.rpm"
RPM_HASH = "445e002992920addff4eb1d2974fc098f473f4267d999de7682cef597708ea60c2eb8b93a7137a5963bf36f93bda9e3c99b72d75a65016145efc599513e19099"

RPROVIDES:${PN} += "python-OpenColorIO \
python3-OpenColorIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenColorIO.so.2.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
