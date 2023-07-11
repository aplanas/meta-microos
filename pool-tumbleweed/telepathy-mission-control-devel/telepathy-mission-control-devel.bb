SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "telepathy-mission-control-devel-5.16.6-1.10.aarch64.rpm"
RPM_HASH = "28cec278078fcd7a7439c8ae7e4d06df705ddfd1a6f0f2067861e1e0426c53f01062c014b0c9cda62a25c8af3e76a09c1a71bba8f0e14ad5d3310fe88512a2a8"

RPROVIDES:${PN} += "pkgconfig-mission-control-plugins \
telepathy-mission-control-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmission-control-plugins0 \
pkgconfig-telepathy-glib \
telepathy-mission-control"

inherit rpm
