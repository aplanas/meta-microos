SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-atom-0.10.0-2.3.aarch64.rpm"
RPM_HASH = "50d1e4bf929c402f82774f765b4ed478d8610c76cb9a6557a527e42518706171edece9362df73a729df3518cef46a2be45936fcb267c22f0619da49a63f90f97"

RPROVIDES:${PN} += "python3.10dist-atom \
python310-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
