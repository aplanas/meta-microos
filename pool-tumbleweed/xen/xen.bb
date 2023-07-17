SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_06"

RPM_NAME = "xen-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "acd6589e3c9a3e86abf8d3a1dd5d74c5d5f14925d4f46fc22cbeff008df03bfcc862fbc26d5b76055e7a5c4c6bb97e5696f586a6f19a118024a8aff9b4aacaed"

RPROVIDES:${PN} += "installhint-reboot-needed \
xen"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
systemd"

inherit rpm
