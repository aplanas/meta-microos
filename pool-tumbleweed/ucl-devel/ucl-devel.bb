SUMMARY = "Development files for the UCL library"
DESCRIPTION = "Headers and other development files for UCL library."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "ucl-devel-1.03-5.4.aarch64.rpm"
RPM_HASH = "2f4dcecfd118623d4218aa54d371851b0ec7e41aa1524be585efcaec7e982966fe77ffdf915aed1ff99dd512b5e9101933067d439405ca02f07abc5697d9ce16"

RPROVIDES:${PN} += "libucl1-devel \
ucl-devel"

RDEPENDS:${PN} += "libucl1"

inherit rpm
