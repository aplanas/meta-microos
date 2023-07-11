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

RPM_NAME = "openmarkup-manual-1.1-24.7.noarch.rpm"
RPM_HASH = "527c44091a06ade3cf1e2ad0717ecd5148047ef85ce7e0c181d9de45521f5d7478162569dbde1fa0a46ff13808e685bfa7225e11548fc4f7a489762fb9767729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-manual"

RDEPENDS:${PN} += ""

inherit rpm
