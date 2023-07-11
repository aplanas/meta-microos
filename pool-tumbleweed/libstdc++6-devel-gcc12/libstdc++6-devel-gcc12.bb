SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-devel-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "69659211093e1fb7509fcb2de93ebd29a7b20c5f13e546f2878c864f104be0a695b9f17bb251df7fedc577f7031465e8a52c28376633dbbceff518b9641ccdd7"

RPROVIDES:${PN} += "libstdc++6-devel-gcc12"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
