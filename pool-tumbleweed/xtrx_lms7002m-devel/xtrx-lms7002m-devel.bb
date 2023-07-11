SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver - devel"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xtrx_lms7002m."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "xtrx_lms7002m-devel-0.0.0+git.20171206-1.22.aarch64.rpm"
RPM_HASH = "488dd38f233b7f29c3c2de14b2352e22a79ceec671a8dc8725c726f68e59add92ce9db1ceec9dfe9a44bd3a68800361a90db901d4ecf1a9cc05c409307aeab12"

RPROVIDES:${PN} += "xtrx-lms7002m-devel"

RDEPENDS:${PN} += "libxtrx-lms7002m0-0-0-SUSE"

inherit rpm
