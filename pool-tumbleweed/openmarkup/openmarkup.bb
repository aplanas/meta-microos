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

RPM_NAME = "openmarkup-1.1-24.7.noarch.rpm"
RPM_HASH = "7262a66350c65753844205c125ec2c1ba1a417992bace6034728bb1cea84c2c283ee569b951750c9f54298b497f76ef253fb499ed6d21f935b8b8beedcaad5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup"

RDEPENDS:${PN} += ""

inherit rpm
