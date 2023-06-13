SUMMARY = "3D Viewer for chemical structures"
DESCRIPTION = "Jmol is a Java-based viewer for chemical structures in 3D with \
features for chemicals, crystals, materials and biomolecules."
LICENSE = "LGPL-2.1-only"

PV = "14.32.73"

RPM_NAME = "jmol-14.32.73-1.2.noarch.rpm"
RPM_HASH = "ebe13f7960dbf2d57d1b98ab85087fc3fe8e4c34626e918b631675472ed91fae5770e56533b6e3bdf5ea6650a8d7b2546adec40e5525af4229b5d22dbeee805c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(jmol.desktop) \
jmol"

RDEPENDS:${PN} += "/bin/sh \
java"

inherit rpm
