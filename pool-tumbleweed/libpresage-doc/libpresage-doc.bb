SUMMARY = "Intelligent predictive text entry platform (documentation)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the libpresage API Documentation in HTML format."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-doc-0.9.1-13.1.noarch.rpm"
RPM_HASH = "c89c2b3118c803a43d8ffbe3490dc9125f964bcdc908aced7aab8acb4b72122abf6378d5fb739ce4c6ace34bf441ebc6ec01300f9b769a24c8f65fa130fabcf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpresage-doc"
RDEPENDS:${PN} += ""

inherit rpm
