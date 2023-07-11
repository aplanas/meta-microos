SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-atom-0.10.0-2.3.aarch64.rpm"
RPM_HASH = "86d65cdf3bfbd16c1792378948ed9451bfec6c7215bf6cd9520da02c3f530ab0278a3f79c707e5cf93311f94ca46ab74926d6a92f683dac0bb9a4e6052177cee"

RPROVIDES:${PN} += "python3-atom \
python3.11dist-atom \
python311-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
