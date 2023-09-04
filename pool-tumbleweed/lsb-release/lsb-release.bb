SUMMARY = "Linux Standard Base Release Tools"
DESCRIPTION = "Tools from the Linux Standard Base project to determine the used distribution"
LICENSE = "GPL-2.0-or-later"

PV = "3.2"

RPM_NAME = "lsb-release-3.2-2.1.noarch.rpm"
RPM_HASH = "b0474e34675f29c5a5474ee68a10edbbe979df7a97869b6e0b02b4ee58432eda6cb182e1eea330bab11b6b43847b6c366aad225a5e77a0ba7d386cf6a803f6f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsb-release"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
