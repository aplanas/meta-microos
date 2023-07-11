SUMMARY = "Simplified Java Printing Support for SWT"
DESCRIPTION = "A simple, light weight, extensible Java printing plug-in for SWT."
LICENSE = "EPL-1.0"

PV = "1.0.4"

RPM_NAME = "paperclips-1.0.4-3.7.noarch.rpm"
RPM_HASH = "1f9508f5be4445ba518963c516dc43c7cc8ffb628a164237ad68939c3373f2aa8172c818817e66ee25abdb6815974a318ae3e1ab2e95babef626995d8fb64f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paperclips"

RDEPENDS:${PN} += ""

inherit rpm
