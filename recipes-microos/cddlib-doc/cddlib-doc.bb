SUMMARY = "Documentation for the cddlib API"
DESCRIPTION = "cddlib is an implementation of the Double Description Method of \
Motzkin et al. \
 \
This package contains the documentation to cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-doc-0.94m-1.10.noarch.rpm"
RPM_HASH = "41b2f896131143dad9421b66dbf23954ea844d2527b022e242de8f408daa6cdf1a236386af41af11a9d4c057823bf494e3f09c690ae0e0a6f52aeb50cbc7bae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cddlib-doc"
RDEPENDS:${PN} += ""

inherit rpm
