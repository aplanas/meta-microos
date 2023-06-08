SUMMARY = "Extra Plug-Ins for ALSA Library"
DESCRIPTION = "This is a meta package installing a few sub-packages for extra plug-ins \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "3845199ed0b9e1e69e4fdacf5d55005cf46f9aebe6c46bbb3d1ec676ec2dd1b0149736c077a198cacbd95395f967672e114dabfc8d05bd119829759fa5f59a70"

RPROVIDES:${PN} += "alsa-plugins alsa-plugins(aarch-64)"
RDEPENDS:${PN} += "alsa-plugins-speexrate alsa-plugins-upmix"

inherit rpm
