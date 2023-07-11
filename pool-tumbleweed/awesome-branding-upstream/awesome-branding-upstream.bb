SUMMARY = "Upstream Branding for awesome"
DESCRIPTION = "This package provides the upstream look and feel for awesome."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "awesome-branding-upstream-4.3-4.14.noarch.rpm"
RPM_HASH = "307e7b14d5ad00ef70c9889e80e3b6b63b7982b4ac5bbe82c0711a8672f31364a39a5ea295dc6b019de8624e5afbea4dbe43e59be05b21af43751536b271f591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-branding \
awesome-branding-upstream \
config-awesome-branding-upstream"

RDEPENDS:${PN} += "awesome"

inherit rpm
