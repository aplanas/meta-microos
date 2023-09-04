SUMMARY = "Shared data for Kismet and its plug-ins"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage sets up the system user/group for the rest of Kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-common-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "f89f360cbd47b8b6aad80968ca487efa469015d2aad232014968fdd05517a62d011fc3fa5cd89b7232f3e160e0f588b081ddb2fd1093ee8181031e0794c9f45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kismet \
kismet-common \
user-kismet"

RDEPENDS:${PN} += "sysuser-shadow"

inherit rpm
