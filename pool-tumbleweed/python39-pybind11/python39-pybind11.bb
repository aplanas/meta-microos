SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python39-pybind11-2.10.4-2.2.noarch.rpm"
RPM_HASH = "255b2e26be491a1ef75ca2e88854e042d075e3e166d58050016eef0935dd4957029fc9578088ac9efec6ca49fe0594658d9163137752cd4fc7fab0a60b4f5725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybind11 \
python39-pybind11 \
python3dist-pybind11"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
