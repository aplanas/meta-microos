SUMMARY = "Common files used by nDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains common files used by nDPI."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "ndpi-common-4.0-1.9.aarch64.rpm"
RPM_HASH = "800033c3f6846eda3f0eb4a53ece5c9d41fe8595fa9e7ef0b5ea9d7f9b92ddb240107c9912bf59021475b8ee76282cf5a78ff27fd5ee753e25e5684e82782205"

RPROVIDES:${PN} += "ndpi-common"

RDEPENDS:${PN} += ""

inherit rpm
