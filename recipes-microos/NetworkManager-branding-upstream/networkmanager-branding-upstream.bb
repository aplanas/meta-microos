SUMMARY = "Default upstream configuration for NetworkManager"
DESCRIPTION = "This package provides the default upstream configuration for \
NetworkManager. Specifically, \
it is not configured for connection checking against \
http://conncheck.opensuse.org. For, the version with connection \
checking, install NetworkManager-branding-openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-branding-upstream-1.42.6-2.1.noarch.rpm"
RPM_HASH = "9ff1a4163e787deb6d575805026f5c5927f72405200a0b387a9c751c3c310a43fc3ba6bca98b2f5b5f4771a83ed062fbc998eab297a8ffefe1c4e608bbb5e225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding NetworkManager-branding-upstream"
RDEPENDS:${PN} += "NetworkManager"

inherit rpm
