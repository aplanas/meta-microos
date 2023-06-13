SUMMARY = "Manual for xml-commons-apis"
DESCRIPTION = "Manual for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-manual-1.4.01-4.6.noarch.rpm"
RPM_HASH = "0a4346292536230ab25b71811f42b14c9f6c23797643994b84f6fb1a90c6d3717443f7b0e6bd42043313b64385fd1fac0b69d37d388cd3932f0b56411d32dc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-manual"

RDEPENDS:${PN} += ""

inherit rpm
