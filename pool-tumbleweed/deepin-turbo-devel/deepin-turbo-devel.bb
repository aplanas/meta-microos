SUMMARY = "Development tools for deepin turbo"
DESCRIPTION = "The deepin-turbo-devel package contains the header files for deepin-turbo."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "deepin-turbo-devel-0.0.5-2.10.aarch64.rpm"
RPM_HASH = "479eace0289b7d59277935197411d2ff53b459352878f2da0a6eecdc267961575c509284cee85944c9be5fd15ecd3823030eeccb3a45370e7ba8a4695af9e558"

RPROVIDES:${PN} += "deepin-turbo-devel"

RDEPENDS:${PN} += "libdeepin-turbo0"

inherit rpm
