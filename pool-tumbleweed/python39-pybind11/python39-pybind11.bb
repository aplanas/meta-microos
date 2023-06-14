SUMMARY = "Module for operability between C++11 and Python"
DESCRIPTION = "pybind11 is a header-only library that exposes C++ types in Python \
and vice versa, mainly to create Python bindings of existing C++ \
code. It can reduce boilerplate code in traditional extension modules \
by inferring type information using compile-time introspection."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python39-pybind11-2.10.4-2.1.noarch.rpm"
RPM_HASH = "48457bcd1b083c76bf28fa51fd2bf763cd83f01be6964c028763deefffa7d6915c467e86caff9a0c1729a12e5fb663befaee7fbe0b55a94d70f301dc0b07f3d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybind11 \
python39-pybind11 \
python3dist-pybind11"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python-abi"

inherit rpm
