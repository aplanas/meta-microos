SUMMARY = "Tool for setting the special features of some Logitech mice"
DESCRIPTION = "lomoco can configure vendor-specific options on Logitech USB mice (or \
dual-personality mice plugged into the USB port). A number of recent \
devices are supported. The program is mostly useful in setting the \
resolution to 800 cpi on mice that boot at 400 cpi (such as the \
MX-500), and disabling SmartScroll or Cruise Control for those who \
would rather use the two extra buttons as ordinary mouse buttons. \
 \
You can configure which features should be enabled in \
/etc/sysconfig/logitech_mouse"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "lomoco-1.0-127.21.aarch64.rpm"
RPM_HASH = "656725ad899451f309aaa1a9222a0e42f775d341fbc73a691f611d1c07fb840c9cfbc6719da7c49ac046cca6564879ba5ccc671c2ff680604d561d19c1e2eb2a"

RPROVIDES:${PN} += "lmctl-/usr/bin/lmctl \
lomoco"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
