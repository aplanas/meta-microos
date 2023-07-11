SUMMARY = "Manual for Multi-Schema Validator"
DESCRIPTION = "Manual for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-manual-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "3e66a90469499704d74af335f7c3a219a258f777c744eb32faa95c4039fd0649eba01ad256bafafc9e7d3fec1dd7e3fb9fca66d1656b671efe3001a8bc08d9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-manual"

RDEPENDS:${PN} += ""

inherit rpm
