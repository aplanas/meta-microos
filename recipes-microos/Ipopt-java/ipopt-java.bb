SUMMARY = "Java bindings for Ipopt"
DESCRIPTION = "This package provides the java bindings for Ipopt in a jar file."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "Ipopt-java-3.14.12-1.1.noarch.rpm"
RPM_HASH = "609365ae50b54970b97fa79cc3d4838c25f360f6669507d13a55ec64096d0ac4e64500b1e5dd69d998dea9e4d3913e06a5e47783fcdd80a2143233aa20fd851a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Ipopt-java"
RDEPENDS:${PN} += ""

inherit rpm
