SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4"

RPM_NAME = "iwd-2.4-1.1.aarch64.rpm"
RPM_HASH = "79de7eae91d4c8c05a47d68e65a1e3d642ad0e7b96b62d4a307628bb8901637fca97d254c2d9aa51504c6523b8097408d0b3af4bec940abdffbc393bd35ee6f1"

RPROVIDES:${PN} += "iwd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libell.so.0 \
libreadline.so.8"

inherit rpm
