SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-devel-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "0af2541fe3923751016e2f78f2ddb17e19b43a0fe26c21cf3bdfaec080752c5bf7fc0f1e4959e5fa8e1b9367790a9f7c366b2f1d4b2528ceb6636935448af486"

RPROVIDES:${PN} += "libstdc++6-devel-gcc12 \
libstdc++6-devel-gcc12(aarch-64)"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
