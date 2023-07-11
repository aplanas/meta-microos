SUMMARY = "LIRC development files"
DESCRIPTION = "LIRC is a package that supports receiving and sending IR signals with \
the most common IR remote controls. It contains a daemon that decodes \
and sends IR signals, a mouse daemon that translates IR signals to \
mouse movements, and a couple of user programs that allow you to \
control your computer with a remote control."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-devel-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "5e3a6934ac75b72b081fd079340d67b216f016e1c5bcf155eab09700554dee5c3fc0ec081cf735bd20b5ca6339eeae30ee33624b222f9a40c9239029b7d57884"

RPROVIDES:${PN} += "lirc-devel \
pkgconfig-lirc \
pkgconfig-lirc-driver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libirrecord0 \
liblirc-client0 \
liblirc-driver0 \
liblirc0"

inherit rpm
