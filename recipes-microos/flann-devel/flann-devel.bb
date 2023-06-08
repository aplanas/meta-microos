SUMMARY = "Development files for flann"
DESCRIPTION = "Fast Library for Approximate Nearest Neighbors. \
 \
This package contains the header files and libraries needed to develop \
application that use flann."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "flann-devel-1.9.2-3.3.aarch64.rpm"
RPM_HASH = "8e7c634a61a6420a84da0f3eee26fd931ee95170df0ce1cfb175f307d51ababd9497c458b93ca7c190b0b491074aac7d27aa0ca695d44a15dca197badcecccaf"

RPROVIDES:${PN} += "cmake(flann) flann-devel flann-devel(aarch-64) pkgconfig(flann)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libflann1_9 liblz4-devel"

inherit rpm
