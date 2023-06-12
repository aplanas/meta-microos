SUMMARY = "A Collection of Documentation Utilities for GNOME"
DESCRIPTION = "The gnome-doc-utils package is a collection of documentation \
utilities for the GNOME project. It contains utilities for building \
documentation and auxiliary files in a source tree. It also contains \
the DocBook XSLT stylesheets that were once distributed with Yelp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.20.10"

RPM_NAME = "gnome-doc-utils-devel-0.20.10-21.5.noarch.rpm"
RPM_HASH = "4882b411cca048156f72ae874e14de68ec1b4b56c7ad8f862efecf31adf77ba46727b43ce4beb14d078ad1109122f6a15aa7f498af40c13f209ef2387334ee60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-doc-utils-devel \
pkgconfig(gnome-doc-utils)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
docbook_4 \
gnome-doc-utils \
xml2po-devel"

inherit rpm
