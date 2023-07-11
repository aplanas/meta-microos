SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_04"

RPM_NAME = "xen-4.17.1_04-1.2.aarch64.rpm"
RPM_HASH = "8a88ed2e44f6db2290f841ae751eeb0eae2beb5fbe4c3f964e35441083635920eb9cf0cec85b29f4370c52f53345793e4f2ffc4ddbab0d2fa60cae0319d3a1fa"

RPROVIDES:${PN} += "installhint-reboot-needed \
xen"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
systemd"

inherit rpm
