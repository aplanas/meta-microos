SUMMARY = "Development files for erfa"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use erfa."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "erfa-devel-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "3ad781dbb061a230bd2b23ede273bd134123431cf516cb17c145a5d9784f72b20a8b7ac83cc873e9d205e66929312fe938fb3964517860f009cd113482095b61"

RPROVIDES:${PN} += "erfa-devel \
pkgconfig-erfa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liberfa1"

inherit rpm
