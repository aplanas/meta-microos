SUMMARY = "plasma5-integration development headers"
DESCRIPTION = "This package provides development headers for plasma5-integration. They \
are not meant to be used standalone, but are required for building other \
Plasma components."
LICENSE = "GPL-2.0+"

PV = "5.27.5"

RPM_NAME = "plasma5-integration-devel-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "f21df0afb76926687671bcade442ff451ba7afe8840b4b2b55d07879929627e32b84f0e8107990cc7d8e783cf829bc65f747a0ad76260160873743b3da849951"

RPROVIDES:${PN} += "pkgconfig(plasma-key-data) \
plasma5-integration-devel \
plasma5-integration-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
plasma5-integration-plugin"

inherit rpm
