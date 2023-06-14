SUMMARY = "Documentation for libamd"
DESCRIPTION = "Documentation for libamd."
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "libamd-doc-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "3acad7a7a867103d016735459d8be9602914e291d8870fb295039a66069608d66fe8dd230adcae35bb86053b5dadc270d59563e46c37a258d9a4c18b99abe718"

RPROVIDES:${PN} += "libamd-doc"

RDEPENDS:${PN} += ""

inherit rpm
