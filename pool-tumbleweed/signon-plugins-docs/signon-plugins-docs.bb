SUMMARY = "Documentation for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the documentation for the Single Sign On Framework's \
plugins."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-docs-8.60-2.19.noarch.rpm"
RPM_HASH = "774f58bcb244376c20425c7cd001e5dce0cc9d46141c29258b5dc2a56cd9b31890821c08f374a5f157fbf3c015983d877b8a7b90309d6f719fb583872db2ffa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signon-plugins-docs"

RDEPENDS:${PN} += ""

inherit rpm
