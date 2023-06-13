SUMMARY = "Documentation for the InChI library"
DESCRIPTION = "This package contains the user documentation for the InChI software \
and InChI library API reference for developers."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-doc-1.06-2.3.noarch.rpm"
RPM_HASH = "277c49be6de1e1a5f46d8dfcf7126d33762acec075cb046a868d22ad5d5cc541f54ba2565cbe093514f0dbe5967a582c41a70d9ecfc85928685875961f65f135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inchi-doc"

RDEPENDS:${PN} += ""

inherit rpm
