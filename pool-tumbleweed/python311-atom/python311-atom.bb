SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-atom-0.10.0-2.1.aarch64.rpm"
RPM_HASH = "885febb1915ad5b9ea56746e86c08179d125b6dbdded908f84484089766dc7a27a118f1f76ec988b9c61aacd2a355e5a3fe93b339a3bfd0a220fe47d4293441f"

RPROVIDES:${PN} += "python3.11dist-atom \
python311-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
