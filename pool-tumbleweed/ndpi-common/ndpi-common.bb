SUMMARY = "Common files used by nDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains common files used by nDPI."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "ndpi-common-4.0-1.8.aarch64.rpm"
RPM_HASH = "232e017de8c3018b9ccb9caf7ad54dce48e04816124fc3702709f9900bbcbc5c0f0431ddc8ed2ab480f7e71b0b4a9d9baad4d950801e331630e77cf9e199ff22"

RPROVIDES:${PN} += "ndpi-common"

RDEPENDS:${PN} += ""

inherit rpm
