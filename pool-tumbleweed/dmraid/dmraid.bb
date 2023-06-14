SUMMARY = "A Device-Mapper Software RAID Support Tool"
DESCRIPTION = "This software discovers, activates, deactivates, and displays \
properties of software RAID sets, such as ATARAID, and contained DOS \
partitions. \
 \
dmraid uses libdevmapper and the device-mapper kernel runtime to create \
devices with respective mappings for the ATARAID sets discovered. \
 \
The following ATARAID types are supported: \
 \
- Highpoint HPT37X \
 \
- Highpoint HPT45X \
 \
- Intel Software RAID \
 \
- Promise FastTrak \
 \
- Silicon Image Medley"
LICENSE = "GPL-2.0-only"

PV = "1.0.0.rc16.3"

RPM_NAME = "dmraid-1.0.0.rc16.3-2.3.aarch64.rpm"
RPM_HASH = "add7acc29359af7e7b62225529651aa388cdc32eb71bc77cc64314934bad440e1a0612a19703bfa2c7c9e72c316965ffcacf8cb4b542d8f3de4441ca1b407bc1"

RPROVIDES:${PN} += "dmraid \
libdmraid-events-isw.so \
libdmraid.so.1"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
aaa-base \
coreutils \
fillup \
kpartx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
systemd"

inherit rpm
