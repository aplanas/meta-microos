SUMMARY = "Simple text based JeOS first boot wizard"
DESCRIPTION = "Simple text based JeOS first boot wizard that can be used instead \
of the line based one that is built into systemd."
LICENSE = "MIT"

PV = "1.2.0.6"

RPM_NAME = "jeos-firstboot-1.2.0.6-1.1.noarch.rpm"
RPM_HASH = "7b32928b46eb1792f820bb1330f02fe63f9f5528c5c8eed849b847f87a6a7e13c2c43eb955cfc20de42c2d2a5631da16325e00a6806ac43697532c88d42a8711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeos-firstboot"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dialog \
iproute2 \
live-langset-data \
systemd \
timezone"

inherit rpm
