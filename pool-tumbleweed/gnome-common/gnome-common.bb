SUMMARY = "Common Files to Build GNOME"
DESCRIPTION = "Gnome-common includes files used by to build GNOME and GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.18.0"

RPM_NAME = "gnome-common-3.18.0-3.11.noarch.rpm"
RPM_HASH = "9cf423e3269b60ee39ec9b6da825d121a232ebbc8d62c442442c0e2f1b942bb74e96591ad896ac497130ef1693615187531df4bbf8a30ee6c519abfebbdfca2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-common"

RDEPENDS:${PN} += "/usr/bin/sh \
autoconf \
autoconf-archive \
automake \
gettext-tools \
glib2-devel \
gtk-doc \
intltool \
libtool \
pkgconfig \
yelp-tools"

inherit rpm
