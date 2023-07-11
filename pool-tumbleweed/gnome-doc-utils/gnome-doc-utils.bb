SUMMARY = "A Collection of Documentation Utilities for GNOME"
DESCRIPTION = "The gnome-doc-utils package is a collection of documentation \
utilities for the GNOME project. It contains utilities for building \
documentation and auxiliary files in a source tree. It also contains \
the DocBook XSLT stylesheets that were once distributed with Yelp."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "gnome-doc-utils-0.20.10-21.6.noarch.rpm"
RPM_HASH = "19302d2bbabde775b5b7397f1acec751c6552215821725b4d94f73065483b406ad6e99c50d4494897df591747fdd1b6fca8c68700a85853acda3814a83f7ee44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-doc-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
libxslt \
python3-libxml2"

inherit rpm
