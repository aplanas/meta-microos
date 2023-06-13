SUMMARY = "Development files for zlib-ng-compat"
DESCRIPTION = "The zlib-ng-compat-devel package contains header files for \
developing application that use zlib-ng-compat."
LICENSE = "Zlib"

PV = "2.0.7"

RPM_NAME = "zlib-ng-compat-devel-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "13c25f43153a9188e300307be13b82b55b8b40dd26a3999c375ccf84801d8febef51d3c86bc432518baa19cba59be07b14431a207dd3e51378ff17f50f916c03"

RPROVIDES:${PN} += "pkgconfig(zlib) \
zlib-devel \
zlib-ng-compat-devel \
zlib-ng-compat-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng-compat1"

inherit rpm
