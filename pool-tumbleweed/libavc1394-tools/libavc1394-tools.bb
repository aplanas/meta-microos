SUMMARY = "Utilities for AV/C 1394"
DESCRIPTION = "Command-line utilities to inspect and control AV/C hardware."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-tools-0.5.4-19.15.aarch64.rpm"
RPM_HASH = "cceb1e6d0111fe4a97d1528e843b463f676cacf4a7307b917d44328d43205160ef952188c5078e4f566963ce31f3ef648058a49f8bca7d7cb6bd78e90cfa574c"

RPROVIDES:${PN} += "libavc1394 \
libavc1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavc1394.so.0 \
libc.so.6 \
libraw1394.so.11 \
librom1394.so.0"

inherit rpm
