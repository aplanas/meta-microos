SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python310-pybind11-2.10.4-2.2.noarch.rpm"
RPM_HASH = "aeee7d834162c9cb104672bf6f89ea45bdc8f53e1281f1b5082b11e19759c2279b80282bc6f8eaf56b5ede282e4082fc96063a2b55f8c47445dcbb2c3d74f404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybind11 \
python310-pybind11 \
python3dist-pybind11"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
