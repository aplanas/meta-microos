SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver - devel"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xtrx_lms7002m."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "xtrx_lms7002m-devel-0.0.0+git.20171206-1.21.aarch64.rpm"
RPM_HASH = "c462119aafaa0c4385af428356a5df8d0b95dbe450f98e45645534c32b1d53bcc332b66329125deb28a6cac536e6ba5e5668e895961b018d845c4f17f0548f84"

RPROVIDES:${PN} += "xtrx_lms7002m-devel \
xtrx_lms7002m-devel(aarch-64)"

RDEPENDS:${PN} += "libxtrx_lms7002m0_0_0-SUSE"

inherit rpm
