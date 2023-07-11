SUMMARY = "An example tools to forward localhost ports to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
Multiple connections to different TCP ports can happen in parallel. An example \
(and useful) tool called 'iproxy' is included that allows you to forward \
localhost ports to the device---allows SSH over USB on jailbroken devices, or \
allowing access the lockdown daemon (and then to all of the file access, sync, \
notification and backup services running on the device)."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "libusbmuxd-tools-2.0.2-1.10.aarch64.rpm"
RPM_HASH = "1247bab4682b395b2d06905be3bfc954451dbc08a7a54b0e96b8f9d338974bbb9f49b66a6db30e11c8f8018033a4355f60f90353862f7c4a51a96faee65eb440"

RPROVIDES:${PN} += "iproxy \
libusbmuxd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbmuxd-2.0.so.6"

inherit rpm
