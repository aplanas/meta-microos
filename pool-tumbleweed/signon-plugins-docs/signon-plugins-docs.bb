SUMMARY = "Documentation for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the documentation for the Single Sign On Framework's \
plugins."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-docs-8.61-1.1.noarch.rpm"
RPM_HASH = "aa4c13ad1bb0c39a49ac93a923529d4c22291c2daa78454a5315c9d18c9409081c6da36553b0aceb7ed5a092c6b9f02c6d1b23a72036e6ee9454640c126b11d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signon-plugins-docs"

RDEPENDS:${PN} += ""

inherit rpm
