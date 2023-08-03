SUMMARY = "Documentation files for the gnome-builder package"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-doc-44.1-1.5.noarch.rpm"
RPM_HASH = "be17854a7ce3987ced53b07e8a62bb8952b93e9dd44864c6a90820e8e683f045635cbf37ef3a8f444ba55a68ad7ed8c7569c245cab3cae075229daf3f977b64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-doc"

RDEPENDS:${PN} += "gnome-builder"

inherit rpm
