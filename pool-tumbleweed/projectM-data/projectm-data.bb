SUMMARY = "Data files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its data: config, presets, shaders."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-data-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "0f75946abbd806211addaf9ddb537747675f0c8f065a09972dc30938cc3ec836054c5302d1df7d7cf7c97c71cde3a433ae618345c7dd2a221ed8d86d37f7cfd4"

RPROVIDES:${PN} += "projectM-data \
projectM-data(aarch-64) \
projectM-qt5-data"
RDEPENDS:${PN} += "dejavu \
projectM"

inherit rpm
