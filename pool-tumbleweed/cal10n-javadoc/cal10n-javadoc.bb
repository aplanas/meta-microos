SUMMARY = "Javadoc for cal10n"
DESCRIPTION = "API documentation for cal10n."
LICENSE = "MIT"

PV = "0.8.1.10"

RPM_NAME = "cal10n-javadoc-0.8.1.10-1.4.noarch.rpm"
RPM_HASH = "c9cf40826b498ec674ebcf0b08bbef71ac187e316d01bb33cc0fcd312530cedaa7a09e0c2cd93fe6c765887512df297e39ef6579cbdd5545a2c079c18d976ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
