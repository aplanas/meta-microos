SUMMARY = "Documentation for hwloc"
DESCRIPTION = "This package contains the documentation for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-doc-2.9.0-3.1.noarch.rpm"
RPM_HASH = "e6d0fef550f8a622ce008b0946f8d849b8f3521237b499550e1ccc26b6bce7aa511769ba1b271ae82a8fe145bb7b2e17cb93e0be8315231ef72f9a1eac57ef36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
