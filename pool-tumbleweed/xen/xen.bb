SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.17.2_02"

RPM_NAME = "xen-4.17.2_02-1.1.aarch64.rpm"
RPM_HASH = "dd927851a5b8713c801d7ae870d43b4ef32f4408ad94ae6bcf36b1d40d3bb8fe771e2748d459612ae80dba022791afaac78ab509d13bb2e3e7434edb115042fa"

RPROVIDES:${PN} += "installhint-reboot-needed \
xen"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
systemd"

inherit rpm
