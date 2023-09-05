SUMMARY = "Documentation for OpenColorIO"
DESCRIPTION = "This package contains documentation for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-doc-2.1.2-4.1.noarch.rpm"
RPM_HASH = "87ca6aaa3d0854083cf950a172496546c2a1696e3ab839605ea44db7827024f1e9c155f331ac80c27edd754709339b9554bf967e2a458035536816fd747bac34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenColorIO-doc"

RDEPENDS:${PN} += ""

inherit rpm
