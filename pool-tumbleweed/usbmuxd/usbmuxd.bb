SUMMARY = "A socket daemon to multiplex connections from and to iOS devices"
DESCRIPTION = "This package provides the usbmuxd daemon for software to use through the \
libusbmuxd library to talk with iPhone/iPod Touch devices. \
 \
Usbmux is an encapsulation protocol (think IP, ATM, PPP) that allows \
multiplexing several conversations onto a single pair of wires."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "usbmuxd-1.1.1-4.4.aarch64.rpm"
RPM_HASH = "0d67d4c329e009ffc075fe8d90e412301e879a25831bb915a8f035672d483e8c39cb576faef0137887dcdfb08bddeed733384eb2d5a3e82d566bc16a6f356b30"

RPROVIDES:${PN} += "group(usbmux) \
usbmuxd \
usbmuxd(aarch-64) \
user(usbmux)"

RDEPENDS:${PN} += "/bin/sh \
group(nogroup) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libimobiledevice-1.0.so.6()(64bit) \
libplist-2.0.so.3()(64bit) \
libusb-1.0.so.0()(64bit) \
systemd \
sysuser-shadow"

inherit rpm
