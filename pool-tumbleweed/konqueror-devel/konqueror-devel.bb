SUMMARY = "KDE Konqueror Libraries: Build Environment"
DESCRIPTION = "Development package for the konqueror libraries."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konqueror-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "df4fa4113c7aa4b3860224c4cc8c1687db52bba55582ece7278bbf93ac78ae8b1901a461112335a62160407a80b7a4e1beb5a88fdab9fea791eb14197092d8fb"

RPROVIDES:${PN} += "cmake-KF5Konq \
kde-baseapps-devel \
kde-baseapps5-devel \
konqueror-devel \
libkonq-devel"

RDEPENDS:${PN} += "konqueror"

inherit rpm
