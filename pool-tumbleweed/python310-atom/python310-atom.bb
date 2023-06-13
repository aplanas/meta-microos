SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-atom-0.10.0-2.1.aarch64.rpm"
RPM_HASH = "8e8c72479c808b39185575eac8e6473fa0e3d8cc27e542865a28f7275a14c467c4717d4ef23064f14117295082e8fb0adf75f64057519dff2acef65eb2bffeb3"

RPROVIDES:${PN} += "python3-atom \
python3.10dist(atom) \
python310-atom \
python310-atom(aarch-64) \
python3dist(atom)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
