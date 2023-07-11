SUMMARY = "Library for Working with GIF Images - Files Mandatory for Development"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-devel-5.2.1-3.4.aarch64.rpm"
RPM_HASH = "49d296763754e4ad2038ca621f9faad5db57d00f4932510876315391e0c28061713d2469129f85f6537984d3814633c075e09b17eca4dcd6308e99f7d0f7d94b"

RPROVIDES:${PN} += "giflib-devel"

RDEPENDS:${PN} += "libgif7"

inherit rpm
