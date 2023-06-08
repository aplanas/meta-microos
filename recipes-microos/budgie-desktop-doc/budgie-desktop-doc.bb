SUMMARY = "Documentation files for the Budgie Desktop"
DESCRIPTION = "This package provides API Documentation for the Budgie Plugin API, in the \
GTK-Doc HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "budgie-desktop-doc-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "86ae590df56bcc5ef0e66ffd2ada33fb0b9b5187efb6a7c497bd0e77975adc955c13a7acea3dff0c8a26922f1e2dee378ee15aae71b2754b918479ace5ea9a11"

RPROVIDES:${PN} += "budgie-desktop-doc budgie-desktop-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
