SUMMARY = "Documentation for hwloc"
DESCRIPTION = "This package contains the documentation for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "hwloc-doc-2.9.2-1.1.noarch.rpm"
RPM_HASH = "76f84d20fad8938837e894ef7d7a642f7a7b8472c457e38a356c81ec2be8407dcf0323f1b2ae1056d5dfc0edd7580d4465b28bdcad87685c0c7da95ebd8e5503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
