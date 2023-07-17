SUMMARY = "Header files for using awkward in C/C++ code"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
This package provides the header files needed to compile C/C++ codes with \
awkward."
LICENSE = "BSD-3-Clause"

PV = "21"

RPM_NAME = "awkward-devel-21-1.1.aarch64.rpm"
RPM_HASH = "9ce3fcc364f582bcec51221bbd60eda86df01c92042fbdd64f433d9aaf2af80cc978214271d70b03c37db4a9af5862f304858b2976f0262a908a946896d7cec7"

RPROVIDES:${PN} += "awkward-devel \
cmake-awkward-headers"

RDEPENDS:${PN} += ""

inherit rpm
