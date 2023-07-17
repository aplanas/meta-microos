SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kdav-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d0eea99af22864d4884a183c5eeaeef62fa237933f286019737d7eabc7e82b47a919e23e1d78478f8a5d40a1a034cb3f62ec2ac72d55a6a5c5cc2ac85ff3c283"

RPROVIDES:${PN} += "cmake-KF5DAV \
kdav-devel"

RDEPENDS:${PN} += "libKF5DAV5"

inherit rpm
