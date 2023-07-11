SUMMARY = "Documentation for the library of Optimized Inner Loops"
DESCRIPTION = "This package provides documentation for liboil, a library of \
functions that are optimized for various CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-doc-0.3.17-26.8.noarch.rpm"
RPM_HASH = "6bd15ce5e5b5effff487400ccf34bdff4b8a8d2507d13dac03229a028ea4647f0ce9b37c8cafe37d7f134f5dc68264fd843eeeae3b4a3bd430d85287ba42a3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboil-doc"

RDEPENDS:${PN} += ""

inherit rpm
