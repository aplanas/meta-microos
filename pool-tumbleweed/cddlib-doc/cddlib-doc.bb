SUMMARY = "Documentation for the cddlib API"
DESCRIPTION = "cddlib is an implementation of the Double Description Method of \
Motzkin et al. \
 \
This package contains the documentation to cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-doc-0.94m-1.11.noarch.rpm"
RPM_HASH = "fa2e5880d354c9ad09a4e0cafaabb6cf4d17dac7685661dda5f5fe6aa93a9429f1b37ad808ffd1b7cf266364072f5ae9878ffddea3809b70ea4ae2ee481065a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cddlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
