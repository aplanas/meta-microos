SUMMARY = "Python bindings for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python3-spglib-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "fd0a7f7abe7cd5370210c83dc8377ba4a9991b2f29a3a4b7c27cb1e2f20a67b554a0d50f900ed5774944e5c193b0d7c7934299c9d8a494f113fa84b5676cb340"

RPROVIDES:${PN} += "python3-spglib \
python3-spglib(aarch-64) \
python3.10dist(spglib) \
python3dist(spglib)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python3-numpy"

inherit rpm
