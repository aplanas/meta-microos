SUMMARY = "HardWare LiSter"
DESCRIPTION = "lshw (Hardware Lister) is a small tool to provide detailed informaton on the \
hardware configuration of the machine. It can report exact memory \
configuration, firmware version, mainboard configuration, CPU version and \
speed, cache config uration, bus speed, etc. on DMI-capable x86 systems and \
on some PowerPC machines (PowerMac G4 is known to work). \
 \
Information can be output in plain text, XML or HTML. \
 \
For detailed information on lshw features and usage, please see the \
included documentation or go to the lshw Web page, \
http://www.ezix.org/software/lshw.html"
LICENSE = "GPL-2.0-only"

PV = "B.02.19.2+git.20230320"

RPM_NAME = "lshw-B.02.19.2+git.20230320-1.2.aarch64.rpm"
RPM_HASH = "3ec27c3df526986bbe1384ea5242786ec8d448cf0f7b1b7e846a93814d971493ad73784938a9dafc2ec6a45aefc53081c462d6f98decbec71111ee156240f87e"

RPROVIDES:${PN} += "lshw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
