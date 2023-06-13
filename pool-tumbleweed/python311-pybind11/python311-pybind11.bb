SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python311-pybind11-2.10.4-2.1.noarch.rpm"
RPM_HASH = "e3b85844783d41783e98a66df86f3e070b43a2214193342038b4b86261efe776f1f23d89358ab02c792c2d9c8aaf8c895660609da51a3eb298502a9001cdaedb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybind11) \
python311-pybind11 \
python3dist(pybind11)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi)"

inherit rpm
