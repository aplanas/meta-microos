SUMMARY = "Default upstream configuration for NetworkManager"
DESCRIPTION = "This package provides the default upstream configuration for \
NetworkManager. Specifically, \
it is not configured for connection checking against \
http://conncheck.opensuse.org. For, the version with connection \
checking, install NetworkManager-branding-openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-branding-upstream-1.44.0-1.1.noarch.rpm"
RPM_HASH = "4e49565fcadb4d2ae6db8982f565fc7eef7f36f44c452b195f78f358be9ba25a7853333e0fa8e6cc9a5aa81fae1adec78cd20493d8c4343065b434d6896c5ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-upstream"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
