SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-tri.struct-4.1.0-1.6.aarch64.rpm"
RPM_HASH = "44ef6c6ab4a6ff97f9b21fb75930e208f2765e45f3d2d4f31c0cf307313409f244c7ad835f8af2c0f103dc294ab27248c791f0fa981cc4668daef3dc3327008d"

RPROVIDES:${PN} += "python3.10dist-tri.struct \
python310-tri.struct \
python3dist-tri.struct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
