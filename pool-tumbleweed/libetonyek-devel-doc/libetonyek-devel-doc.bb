SUMMARY = "Documentation for the libetonyek API"
DESCRIPTION = "This package contains documentation for the libetonyek API."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-doc-0.1.10-1.12.noarch.rpm"
RPM_HASH = "bf25f217b40937162300f29ceec8da6b3936a323b5c2d25a1853e88c154342b9198e032a7bcea99577c07b0c1ddf9b340de8e00af8687f9ba5357f4377612174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libetonyek-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
