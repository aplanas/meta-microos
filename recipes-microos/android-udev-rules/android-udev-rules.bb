SUMMARY = "Android udev rules list aimed to be the most comprehensive on the net"
DESCRIPTION = "These rules refer to 'Run Apps on a Hardware Device - Android Studio' \
and include many suggestions from the Archlinux and Github Communities."
LICENSE = "GPL-3.0-or-later"

PV = "20230303"

RPM_NAME = "android-udev-rules-20230303-1.1.noarch.rpm"
RPM_HASH = "7f60a227e7cde3dace6a45bbb05bf12fb7daa493a077a81f915ff24fe3b211f956fb92a3b699c203596eec1cc8d2f132f1a3abdec883949d535a166d0d4d6f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-udev \
android-udev-rules \
group(adbusers)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
