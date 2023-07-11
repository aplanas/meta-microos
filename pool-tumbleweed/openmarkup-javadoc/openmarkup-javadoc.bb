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

RPM_NAME = "openmarkup-javadoc-1.1-24.7.noarch.rpm"
RPM_HASH = "2c61ea5c0f942bcafd739f0ebf047b073570fad0d649849d6ff7c5b4c292f1aa74ec41a53ce6b48d18678350d8b769c82b32e485709a62817d21d48a3042d4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
