SUMMARY = "Development tools for dtkcore"
DESCRIPTION = "The dtkcore-devel package contains the header files and developer \
docs for dtkcore. \
 \
You shoud firstly read the 'Deepin Application Specification'."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "dtkcore-devel-5.5.33-1.7.aarch64.rpm"
RPM_HASH = "9e27eeb6c5fba523c2b92f8c65dfa99364dbdf9b2658860f432960f231845c576fccb218d3091ec485a20da52483631b133f08ce1de349756f8f041b639604a2"

RPROVIDES:${PN} += "cmake-DtkCMake \
cmake-DtkCore \
cmake-DtkTools \
dtkcore-devel \
pkgconfig-dtkcore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dtkcommon \
libdtkcore5"

inherit rpm
