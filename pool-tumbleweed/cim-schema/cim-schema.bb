SUMMARY = "Common Information Model (CIM) Schema"
DESCRIPTION = "Common Information Model (CIM) is a model for describing overall \
management information in a network or enterprise environment. CIM \
consists of a specification and a schema. The specification defines the \
details for integration with other management models. The schema \
provides the actual model descriptions."
LICENSE = "SUSE-DMTF"

PV = "2.54.0"

RPM_NAME = "cim-schema-2.54.0-1.3.noarch.rpm"
RPM_HASH = "fa73feee411f88e23af6a01ce1a4a8940f3f9f157236d47276fb1b838af5fd551663abe450ec4730409c5470900d061ad8a98740e9ef1797c3d551ce42532ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cim-schema \
cim-schema-experimental"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
