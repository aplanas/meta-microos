SUMMARY = "Documentation files for the Budgie Desktop"
DESCRIPTION = "This package provides API Documentation for the Budgie Plugin API, in the \
GTK-Doc HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-doc-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "bdb6b6a9dff2bbfb9e4d50c25846e0003c000af18c4c5bff2710b68ba936c6fbfc7c9e84f8e6aca7599b86cb6d6842be6280cd36b54eca04ab6117e2de329e45"

RPROVIDES:${PN} += "budgie-desktop-doc"

RDEPENDS:${PN} += ""

inherit rpm
