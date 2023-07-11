SUMMARY = "System user for PulseAudio"
DESCRIPTION = "System user for PulseAudio"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "system-user-pulse-16.1-4.1.noarch.rpm"
RPM_HASH = "4ade37809e319bcb29fa6acb3699915808f4d13a415ddce548ae4ea08b6b98c48fe724e2d5fe29f4e5888f06ffaeb9bb65cca0fa61744cabc03c6ba7d3f2a481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pulse \
group-pulse-access \
system-user-pulse \
user-pulse"

RDEPENDS:${PN} += "/usr/bin/sh \
group-audio \
sysuser-shadow"

inherit rpm
