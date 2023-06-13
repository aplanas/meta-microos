SUMMARY = "Development files for biblesync"
DESCRIPTION = "This package contains libraries and header files for developing applications \
that use biblesync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "biblesync-devel-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "f4b90aae61e6bd96dc90deee6bd13bcbb1e645ec871426f19f2768f17cfc53cadbb9c3c1390046ec38feed6a341ef3f0e48fd296e8c043b75f0b3852b64b48e8"

RPROVIDES:${PN} += "biblesync-devel \
biblesync-devel(aarch-64) \
pkgconfig(biblesync)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbiblesync2_0 \
libuuid-devel"

inherit rpm
