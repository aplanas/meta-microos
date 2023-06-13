SUMMARY = "Manual for saxon8"
DESCRIPTION = "Manual for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-manual-B.8.8-133.6.noarch.rpm"
RPM_HASH = "808df538218e527553dc10fa23ccc6995741795bc0262a3ae09522b10c3eb1f1b586564dba195805b27a935958d7522077f9cb11f922a8e370e6b4bebe19467a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-manual"

RDEPENDS:${PN} += ""

inherit rpm
