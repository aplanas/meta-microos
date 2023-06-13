SUMMARY = "Samples for Multi-Schema Validator"
DESCRIPTION = "Samples for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-demo-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "58f612e4b4150292fa937036284c5bc1740910aa117dd0ff522e80703749aaf3e476ab15ff652223e69c854a1105bea105c1e370a32e9c459c87eb11961049bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-demo"

RDEPENDS:${PN} += "msv-msv \
msv-xsdlib"

inherit rpm
