SUMMARY = "Hierarchical repository abstraction layer"
DESCRIPTION = "LibRepository provides a simple abstraction layer to access bulk content that \
is organized in a hierarchical layer."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-1.1.6-1.5.noarch.rpm"
RPM_HASH = "84643de768a9d73a3ed6a02e6957c4737e65321ba072cdf60f9c3f93364d4d5bc2d9c8268178333f727d89db181a68a79d5c6a761cd27d2d63d4e9a3db61072a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
