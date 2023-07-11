SUMMARY = "Supplies iSNS support for Linux kernel target"
DESCRIPTION = "Target-isns is an Internet Storage Name Service (iSNS) client for the \
Linux LIO iSCSI target. It allows to register LIO iSCSI targets to an \
iSNS server. \
 \
The iSNS protocol is specified in \
[RFC 4171](http://tools.ietf.org/html/rfc4171) and its purpose is to \
make easier to discover, manage, and configure iSCSI devices. With \
iSNS, iSCSI targets can be registered to a central iSNS server and \
initiators can be configured to discover the targets by asking the \
iSNS server."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "target-isns-0.6.8-2.13.aarch64.rpm"
RPM_HASH = "bfeec244777ded1272bfd5d12f050a8e36517ddf8a82b78802735725347159d05f5694f79ff366e783bb3c0075a6f4cf302839655ebde3ff26b5a9ed9ee2fb88"

RPROVIDES:${PN} += "config-target-isns \
target-isns"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
