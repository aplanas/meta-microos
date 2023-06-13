SUMMARY = "Documentation files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the documentation for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-doc-1.2.2-1.4.noarch.rpm"
RPM_HASH = "6e52e75b13223a2c26918eceddfc761e443712a269f476d96610486faaba58ecac450b55b34e11c7dc7fd4bdd2f31dfe11921b3eea501aace7b8b87a369bca51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqrtr-glib-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
