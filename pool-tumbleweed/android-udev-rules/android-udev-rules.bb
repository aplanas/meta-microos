SUMMARY = "Android udev rules list aimed to be the most comprehensive on the net"
DESCRIPTION = "These rules refer to 'Run Apps on a Hardware Device - Android Studio' \
and include many suggestions from the Archlinux and Github Communities."
LICENSE = "GPL-3.0-or-later"

PV = "20230614"

RPM_NAME = "android-udev-rules-20230614-1.1.noarch.rpm"
RPM_HASH = "37cb9ed0ca0bd7a93f1e0d14726f818655b0f4171bbf9ad807c9481f598b97f72cc65334a5fc7388a98599dc77b03b0360368f20acacbe43e738d068510470d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-udev \
android-udev-rules \
group-adbusers"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
