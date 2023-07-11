SUMMARY = "CPython bindings for libnest2d"
DESCRIPTION = "Binding allowing libnest2d to be called from Python using Numpy."
LICENSE = "LGPL-3.0-only"

PV = "4.12.0"

RPM_NAME = "python3-pynest2d-4.12.0-2.9.aarch64.rpm"
RPM_HASH = "a3baab25c45e96fd1dad5d4d5bba693786ba4b623c5cf27b9e4c1523a1218a95efc0a99d9c43e26ac06753c456c0e95a079b58eb0985b4f8052c89ab1641bfde"

RPROVIDES:${PN} += "python3-pynest2d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnlopt.so.0 \
libpolyclipping.so.22 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
