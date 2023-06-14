SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-atom-0.10.0-2.1.aarch64.rpm"
RPM_HASH = "6b448974e7c9ebc1e04ce3d47f82f910206ce7de5073c2b2a92477e6ea3ae630efffb71dc4cc6436445f26513a918d274952e3f668f354be05e9e02c7e3ca982"

RPROVIDES:${PN} += "python3.9dist-atom \
python39-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
