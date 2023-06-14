SUMMARY = "Documentation for qt6-quick3dphysics in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dd3d8af7d85689ff0734620d3330fee35abdb8ffbd5baf8635136c00e3affaad764dbc9757b4d54f0f78cfc3f89aba31fbeca89a97eef055f243f93d2db90844"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
