SUMMARY = "Include Files and Libraries Mandatory for Development with Grantlee"
DESCRIPTION = "This package contains include files and libraries needed for development with \
grantlee."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "grantlee5-devel-5.3.1-2.1.aarch64.rpm"
RPM_HASH = "fba8eb332554352f83ada4ff3bf4d8518fe972690e53274cd62b96bef09bb1706107155b257702abc1ab431f2eac9c4f3bbe05a6abd7a181a366f812b125aaf7"

RPROVIDES:${PN} += "cmake-Grantlee5 \
grantlee5-devel"

RDEPENDS:${PN} += "cmake \
cmake-Qt5Core \
cmake-Qt5Gui \
grantlee5"

inherit rpm
