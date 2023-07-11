SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python311-localzone-0.9.8-2.1.noarch.rpm"
RPM_HASH = "401f584852fda370ba4385cc06aa950a16e9c4fbe5f8fedf1d269afd1d469092c3ab1092c108f3eec2f104619a6c9fef3a48ead0ad6690547feea9b549149de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-localzone \
python3.11dist-localzone \
python311-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python311-dnspython"

inherit rpm
