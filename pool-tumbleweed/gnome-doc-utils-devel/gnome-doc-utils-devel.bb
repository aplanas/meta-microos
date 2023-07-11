SUMMARY = "A Collection of Documentation Utilities for GNOME"
DESCRIPTION = "The gnome-doc-utils package is a collection of documentation \
utilities for the GNOME project. It contains utilities for building \
documentation and auxiliary files in a source tree. It also contains \
the DocBook XSLT stylesheets that were once distributed with Yelp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.20.10"

RPM_NAME = "gnome-doc-utils-devel-0.20.10-21.6.noarch.rpm"
RPM_HASH = "d6b8955a3834e3998b8c6f718e0c85acac0398d502b324bb2d6ffd181fef6a3c0c6f4fcd48722a9b7f793c9ad9f45674f71cdad7c0f49c9e7ce35d1ec5b6603b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-doc-utils-devel \
pkgconfig-gnome-doc-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
docbook-4 \
gnome-doc-utils \
xml2po-devel"

inherit rpm
