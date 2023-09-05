SUMMARY = "Static version of Busybox - for building Warewulf3"
DESCRIPTION = "This version of busybox is only for building Warewulf3 \
https://github.com/warewulf/warewulf3"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-warewulf3-1.36.1-2.1.aarch64.rpm"
RPM_HASH = "cf8c4bbd71afa83b68ae5ec753a38120e8c5e9397499d0c88af93d97abc83549b5170cd730887c08c3864226dcbaff66586e1085e4aa296a3037470a455af056"

RPROVIDES:${PN} += "busybox-warewulf3"

RDEPENDS:${PN} += ""

inherit rpm
