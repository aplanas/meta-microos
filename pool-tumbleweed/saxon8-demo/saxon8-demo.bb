SUMMARY = "Demos for saxon8"
DESCRIPTION = "Demonstrations and samples for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-demo-B.8.8-133.7.noarch.rpm"
RPM_HASH = "ccf86ef45757dfaf384d130488baa57e90331c5f69ddfc9b004516f96ee348c9ef52a4daa4d4a1c7c0a2465706edba7995b65336974a3fc1d07b33f82290ea1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-demo"

RDEPENDS:${PN} += "saxon8"

inherit rpm
