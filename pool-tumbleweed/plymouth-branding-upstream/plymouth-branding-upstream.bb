SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "36a72dd2644d0aa717ff0e03e26cc6aeee139ac2d3003a6904c587d846bb6c2670623a375f8e8cf668c29f5ce85829a59becc472a56260a1056a5130996548ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
