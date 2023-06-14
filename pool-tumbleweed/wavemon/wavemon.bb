SUMMARY = "An ncurses monitoring application for wireless network devices"
DESCRIPTION = "wavemon is a wireless device monitoring application that allows you to \
watch signal and noise levels, packet statistics, device configuration \
and network parameters of your wireless network hardware. It has \
currently only been tested with the Lucent Orinoco series of cards, \
although it *should* work (though with varying features) with all \
devices supported by the wireless kernel extensions by Jean Tourrilhes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.4"

RPM_NAME = "wavemon-0.9.4-1.2.aarch64.rpm"
RPM_HASH = "e654769e616e310d3c29c25e78a337672feda78ff18a5974be4021467f034178c4b38afe4683db04d71377ee1a4e5c1ef05bc5008ff79f47ec6a346db37c53ba"

RPROVIDES:${PN} += "wavemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libtinfo.so.6"

inherit rpm
