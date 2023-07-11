SUMMARY = "Documentation for hwloc"
DESCRIPTION = "This package contains the documentation for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "hwloc-doc-2.9.1-1.1.noarch.rpm"
RPM_HASH = "37c8ac719fb297b846d766fc4cc1ff3272296f8fa807335c230f945b1a0cd2d868896a24b72d2895339746f1d8edbc74c94762aceb925996f1a9997fe6a1c123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
