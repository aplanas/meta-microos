SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python310-pybind11-2.10.4-2.1.noarch.rpm"
RPM_HASH = "19df8bb18aef4797a4de68e1c1c1500d19ff7f8165930e38721e13c3aafedb71ae370deeb13e0fd351a6000b715b7540092fbaa233a0dfe43c610f41a795d748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11 \
python3.10dist(pybind11) \
python310-pybind11 \
python3dist(pybind11)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi)"

inherit rpm
