SUMMARY = "Common scripts and macros to develop with MATE"
DESCRIPTION = "mate-common is an extension to autoconf, automake and libtool for \
the MATE desktop environment and MATE applications. mate-autogen, \
and several macros are included to help in MATE source trees."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-common-1.26.0-1.6.noarch.rpm"
RPM_HASH = "7f4168f2a7a9d01047d4eddde64087c4aaa35b9c4ae4de0fbd1d12b088dea6c59d88e0c4f00d620b72767fa650a57658550189c793bc7618d2ac685a7aad1342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-common"

RDEPENDS:${PN} += "/bin/sh \
autoconf \
autoconf-archive \
automake \
gettext \
libtool \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gtk-doc"

inherit rpm
