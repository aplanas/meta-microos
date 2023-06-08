SUMMARY = "Default upstream configuration for NetworkManager"
DESCRIPTION = "This package provides the default upstream configuration for \
NetworkManager. Specifically, \
it is not configured for connection checking against \
http://conncheck.opensuse.org. For, the version with connection \
checking, install NetworkManager-branding-openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-branding-upstream-1.42.6-1.1.noarch.rpm"
RPM_HASH = "c3e85a55beed35a41f75f13fdc9f97be2d48edfce50e425a6c404590e25acde537ba02503f04462fecdd4f531a636b2203b1c03bc94bbfd62227e84c50325432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding NetworkManager-branding-upstream"
RDEPENDS:${PN} += "NetworkManager"

inherit rpm
