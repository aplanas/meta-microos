SUMMARY = "Samples for Multi-Schema Validator"
DESCRIPTION = "Samples for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-demo-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "3715623c7066b9c68deb23c3ab1a7ae2dc26ab9dbd0d28f254bcdc61e64a417895acc75623ebad8781bb8763b6781994498bf96ed3139236170d18e77ee9f600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-demo"

RDEPENDS:${PN} += "msv-msv \
msv-xsdlib"

inherit rpm
