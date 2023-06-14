SUMMARY = "Documentation for docbook_5"
DESCRIPTION = "The documentation for the DocBook 5.x specification (5.0 5.1 5.2CR5)"
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "5.2cr5"

RPM_NAME = "docbook_5-doc-5.2cr5-2.1.noarch.rpm"
RPM_HASH = "47f8665f640af21130b591c4f5633164e32a2e4443da7c151ce3db801e133cd04d3235295d2f97097c8f8e946e7f47f7bc57578d11872e1196f53ea6fbc1cb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-5-doc"

RDEPENDS:${PN} += ""

inherit rpm
