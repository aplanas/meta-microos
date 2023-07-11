SUMMARY = "Development tools for dtkcore"
DESCRIPTION = "The dtkcore-devel package contains the header files and developer \
docs for dtkcore. \
 \
You shoud firstly read the 'Deepin Application Specification'."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "dtkcore-devel-5.5.33-1.9.aarch64.rpm"
RPM_HASH = "143d95a53888a23a09381b1b1da1ba840f7f817e19f31fc2288cde3ddd50b5b725e1fa5096dfb450ca59a391de61574093b0cbbe57d4ec2122d897872f0a294f"

RPROVIDES:${PN} += "cmake-DtkCMake \
cmake-DtkCore \
cmake-DtkTools \
dtkcore-devel \
pkgconfig-dtkcore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dtkcommon \
libdtkcore5"

inherit rpm
