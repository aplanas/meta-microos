SUMMARY = "Manual for xml-commons-apis"
DESCRIPTION = "Manual for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-manual-1.4.01-4.7.noarch.rpm"
RPM_HASH = "e64b45f94986a5a612a96bb8eaa138ff401538179d701267990fff8eb5212e04aecf08035297aefc152edfcc6789d3fe3ed3db6407cf57292f313f5e9d36b75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-manual"

RDEPENDS:${PN} += ""

inherit rpm
