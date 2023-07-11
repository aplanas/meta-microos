SUMMARY = "A socket daemon to multiplex connections from and to iOS devices"
DESCRIPTION = "This package provides the usbmuxd daemon for software to use through the \
libusbmuxd library to talk with iPhone/iPod Touch devices. \
 \
Usbmux is an encapsulation protocol (think IP, ATM, PPP) that allows \
multiplexing several conversations onto a single pair of wires."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.1.1+git48.01c94c7"

RPM_NAME = "usbmuxd-1.1.1+git48.01c94c7-1.1.aarch64.rpm"
RPM_HASH = "a26ae80be1e646cbc1960340e1e34b81825af4b61f9acf1b540b1652694699a1f0000eceba9235d4eb94dcb9bccfd0fd819eae5669a6665a83e8df8b3bc0dcc3"

RPROVIDES:${PN} += "group-usbmux \
usbmuxd \
user-usbmux"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libusb-1.0.so.0 \
systemd \
sysuser-shadow"

inherit rpm
