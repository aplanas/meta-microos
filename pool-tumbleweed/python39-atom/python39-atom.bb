SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-atom-0.10.0-2.3.aarch64.rpm"
RPM_HASH = "b5e5ef2b9adb3dc96a57b041eb55a824413d0ba75422363bfe58c2d798e649814ea0b3c9f8e14625abb2dead082543857224c261fd35dd50653278f62d3d5f00"

RPROVIDES:${PN} += "python3.9dist-atom \
python39-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
