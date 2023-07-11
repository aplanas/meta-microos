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

RPM_NAME = "dmraid-1.0.0.rc16.3-2.4.aarch64.rpm"
RPM_HASH = "75d52ce982441603f1bf12f0926ea3afa6cd9f7839a407afd4d27eea2ab5718f19320f6f3753485c7d4bde4bffaeb2f254109459a0cadd75576697abeadf3560"

RPROVIDES:${PN} += "dmraid \
libdmraid-events-isw.so \
libdmraid.so.1"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
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
