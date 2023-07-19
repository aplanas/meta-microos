SUMMARY = "Development files for libdispatch"
DESCRIPTION = "The libdispatch-devel package contains libraries and header files for \
developing applications that use libdispatch."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch-devel-5.6.3-2.1.noarch.rpm"
RPM_HASH = "564a4a27b2697d507956430be6670de15480d16991074baaa4225591ea53464d4dd2bb1f228b068b78b4a5188d3201f3b73c39a0b475ed333ec02fbb3cc733e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdispatch-devel"

RDEPENDS:${PN} += "libdispatch1-3"

inherit rpm
