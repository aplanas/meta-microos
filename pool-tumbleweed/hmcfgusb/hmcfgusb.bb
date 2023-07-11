SUMMARY = "Hmland and utilities to use the HM-CFG-USB(2)"
DESCRIPTION = "This package contains, amongst others, hmland an application, which emulates the \
HomeMatic LAN configuration adapter-protocol to make it possible to use the \
HM-CFG-USB in Fhem or as a lan configuration tool for the CCU or the \
HomeMatic windows configuration software, also supporting devices using \
AES-signing like KeyMatic."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "0.103+git23.g7157286"

RPM_NAME = "hmcfgusb-0.103+git23.g7157286-1.3.aarch64.rpm"
RPM_HASH = "882ca9869c220239b5f24f7e294988a13531e59d7b4a871401756ed0909aac45ebc1230928fc2f86d2ca2406e2b00ea76c5af7aa1c4f2e36081dd5f4a6b4beb4"

RPROVIDES:${PN} += "config-hmcfgusb \
hmcfgusb"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
libusb-1.0.so.0 \
logrotate"

inherit rpm
