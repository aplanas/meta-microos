SUMMARY = "Example C++ programs for libpmemobj++"
DESCRIPTION = "Example C++ programs (with source) on how to use libpmemobj++."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libpmemobj-cpp-devel-doc-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "89196f390052add4aae9f2d0cfb1dcff7562f8c335c12cd765e3850c65965d5dbc6baff29af70162be863f355576b377af18a939c6a299e9462ddc8c4578c06d"

RPROVIDES:${PN} += "libpmemobj-cpp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
