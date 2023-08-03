SUMMARY = "Documentation for the OpenStack DNS as a Service - Client"
DESCRIPTION = "Documentation for the OpenStack DNS as a Service - Client."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python-designateclient-doc-4.5.0-1.5.noarch.rpm"
RPM_HASH = "092436bdf118470d8ee10725598879cb488b172d84df2b4a06632743355614c3804a1ab5b87b037e21b4c600ef8fd23ab1137b3303e5601d0665a5ac4ef47387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-designateclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
