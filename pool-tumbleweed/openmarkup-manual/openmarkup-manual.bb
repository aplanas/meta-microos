SUMMARY = "Open Markup Interface for object realizers and XML object realization"
DESCRIPTION = "The Open Markup project defines an open API called Open Markup \
Interface for object realizers and XML object realization. \
 \
Object realization is a process by which software objects are created, \
configured, and processed according to machine-readable descriptions of \
those objects. It includes post-instantiation tasks, such as \
configuring objects with additional attributes or properties, \
connecting them with other objects to create complex object \
compositions, or otherwise manipulating them according to control \
information embedded in the object descriptions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "openmarkup-manual-1.1-24.6.noarch.rpm"
RPM_HASH = "a94bf25553c305e9d582c47ca2cbc85f6795acfd1a9a7585802dcf4a37ca0314293a94c2c90d02bd87f17327ac7ebcb05abea28200a9b9a5e51523dde5ec21bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-manual"

RDEPENDS:${PN} += ""

inherit rpm
