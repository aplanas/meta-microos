SUMMARY = "Default upstream configuration for NetworkManager"
DESCRIPTION = "This package provides the default upstream configuration for \
NetworkManager. Specifically, \
it is not configured for connection checking against \
http://conncheck.opensuse.org. For, the version with connection \
checking, install NetworkManager-branding-openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-branding-upstream-1.42.8-1.1.noarch.rpm"
RPM_HASH = "783835d3b6c231ad89f831b140746dd2a2016f47546b2b009868e7883add54f57c7f5291651c75ede289431cfccaaba2f29b2c67d55d0015bafd6023d4bf8788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-upstream"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
