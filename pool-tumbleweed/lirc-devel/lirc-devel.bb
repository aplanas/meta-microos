SUMMARY = "LIRC development files"
DESCRIPTION = "LIRC is a package that supports receiving and sending IR signals with \
the most common IR remote controls. It contains a daemon that decodes \
and sends IR signals, a mouse daemon that translates IR signals to \
mouse movements, and a couple of user programs that allow you to \
control your computer with a remote control."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-devel-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "5f0a769715b7946742bb14c39e47794b6162c918a2e21ba7b61e2c26cd59d34e2f15436437f7bbba124abdcee6489a1ecfb35ce206123dfc42e75709508d4553"

RPROVIDES:${PN} += "lirc-devel \
lirc-devel(aarch-64) \
pkgconfig(lirc) \
pkgconfig(lirc-driver)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libirrecord0 \
liblirc0 \
liblirc_client0 \
liblirc_driver0"

inherit rpm
