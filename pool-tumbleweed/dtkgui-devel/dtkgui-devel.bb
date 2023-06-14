SUMMARY = "Development tools for dtkgui"
DESCRIPTION = "The dtkgui-devel package contains the header files and developer docs for \
dtkgui. \
 \
You should first read the 'Deepin Application Specification'."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "dtkgui-devel-5.5.25-1.7.aarch64.rpm"
RPM_HASH = "bc6cd6a3821246f9666451b3eb2d9f2336d7033f6b498cca591ce8725d53ce7b95d5ab70709ddcef10b31e58eba16a8c093270148ae0e98937a1096041633155"

RPROVIDES:${PN} += "cmake-DtkGui \
dtkgui-devel \
pkgconfig-dtkgui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdtkgui5 \
pkgconfig-dtkcore"

inherit rpm
