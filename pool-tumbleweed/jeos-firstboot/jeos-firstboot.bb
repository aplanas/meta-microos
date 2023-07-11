SUMMARY = "Simple text based JeOS first boot wizard"
DESCRIPTION = "Simple text based JeOS first boot wizard that can be used instead \
of the line based one that is built into systemd."
LICENSE = "MIT"

PV = "1.2.0.6"

RPM_NAME = "jeos-firstboot-1.2.0.6-1.2.noarch.rpm"
RPM_HASH = "f5091041b2f5c8360db562a8ffc6258f52040e0f926b5a483bad3cb7e8b966e8d4b9dc861ba3d6badfb8ce56974d5bfbbccc7745061c1fce5f3b20d0f629d283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeos-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dialog \
iproute2 \
live-langset-data \
systemd \
timezone"

inherit rpm
