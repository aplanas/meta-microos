SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "oxygen5-icon-theme-large-5.109.0-1.1.noarch.rpm"
RPM_HASH = "f528ba0767d01c90ea90adf97be958091fc22de8d3b450a5561bbab1fea93d925008a6d29a83b3551275d138b7252f5729809a8f45d70c893a08f56c80cb41ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-large \
oxygen5-icon-theme-large"

RDEPENDS:${PN} += "oxygen5-icon-theme"

inherit rpm
