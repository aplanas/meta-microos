SUMMARY = "A mode switching tool for controlling multiple-device USB gear"
DESCRIPTION = "USB_ModeSwitch is a mode switching tool for controlling 'flip flop' \
(multiple device) USB gear. It allows so-called 'Zero-CD' devices that \
show up as USB storage initially to be switched into their more useful \
'application mode'. This is most common for UMTS/3G wireless WAN \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-2.6.1-2.7.aarch64.rpm"
RPM_HASH = "a679212f74ab79b424f86064ff5122510c12c65980e1ab04cdde8ec4da58f16db7b8ec40de795c4f9cfa34f083588e6516729bc58242d4497af4c6462f82efbc"

RPROVIDES:${PN} += "config-usb-modeswitch \
usb-modeswitch"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/tclsh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
systemd \
tcl \
usb-modeswitch-data"

inherit rpm
