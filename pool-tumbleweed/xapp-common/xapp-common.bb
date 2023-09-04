SUMMARY = "Common files for XApp desktop applications"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This package includes files that are shared between several XApp \
applications (i18n files and configuration schemas)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.6.1"

RPM_NAME = "xapp-common-2.6.1-1.1.noarch.rpm"
RPM_HASH = "861d83752ac28c7447d74fe53e3cd52151bc6d49e8ae4bf53ee231ea23c32c8eee2c96e86946214144dc453b3004140852591de600727d3d00a5efd39f20991e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xapp-common \
xapps-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
typelib-XApp"

inherit rpm
