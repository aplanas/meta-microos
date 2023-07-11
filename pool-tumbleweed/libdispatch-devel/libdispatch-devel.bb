SUMMARY = "Development files for libdispatch"
DESCRIPTION = "The libdispatch-devel package contains libraries and header files for \
developing applications that use libdispatch."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch-devel-5.6.3-1.3.noarch.rpm"
RPM_HASH = "f67808ecd22ec074d07a16fa9dd583f27ccc34792eee1a04c306b3d4f086da2b7440ab1b192c83373770bd043ec87ce1595c94edb1a89cae90a5cadb8071afa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdispatch-devel"

RDEPENDS:${PN} += "libdispatch1-3"

inherit rpm
