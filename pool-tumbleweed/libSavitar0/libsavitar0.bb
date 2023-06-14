SUMMARY = "3D printer control software"
DESCRIPTION = "libSavitar is a C++ implementation of 3mf loading with SIP python bindings."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar0-4.13.1-2.7.aarch64.rpm"
RPM_HASH = "dd25f4d1aa72bf42fa090cd28106e1f4892f839beb3222adf4f355de3b6487226e4806a2380c8db27f62061e22544ec5e96b2a91964ad2a936e5af53a8d62e74"

RPROVIDES:${PN} += "libSavitar.so.0 \
libSavitar0 \
python3-Savitar"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpugixml.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
