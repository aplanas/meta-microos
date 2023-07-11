SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.23.13"

RPM_NAME = "mpd-doc-0.23.13-1.3.noarch.rpm"
RPM_HASH = "6c640b5c1e61a301651828cd77ed1d3ba8a314bd685ac71599f8dc055953ce53862e7eb1ccd98b98f92b95b50914f19c9280ceca8aef92f9d445b4f87e9e77de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpd-doc"

RDEPENDS:${PN} += ""

inherit rpm
