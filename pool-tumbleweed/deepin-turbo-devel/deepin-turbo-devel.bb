SUMMARY = "Development tools for deepin turbo"
DESCRIPTION = "The deepin-turbo-devel package contains the header files for deepin-turbo."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "deepin-turbo-devel-0.0.5-2.9.aarch64.rpm"
RPM_HASH = "8ebd67baf497f6067431d1764caae7c86756dc4f5b750f8a5a0c813ef188cc029ec3321c1bd4eb08f42f50642608e8aeda5b71fb3fb1036899936e22f9eb5d20"

RPROVIDES:${PN} += "deepin-turbo-devel \
deepin-turbo-devel(aarch-64)"

RDEPENDS:${PN} += "libdeepin-turbo0"

inherit rpm
