SUMMARY = "3D Viewer for chemical structures"
DESCRIPTION = "Jmol is a Java-based viewer for chemical structures in 3D with \
features for chemicals, crystals, materials and biomolecules."
LICENSE = "LGPL-2.1-only"

PV = "16.1.13"

RPM_NAME = "jmol-16.1.13-1.1.noarch.rpm"
RPM_HASH = "68c5616810e3fdaafe1ffb0a1fbf09a646bafdc07be7972f47dc23315cf28798d28a24158e5b14208d74aebd2d9598afbfab32fd776449cbc9a35c365399900b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmol"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
