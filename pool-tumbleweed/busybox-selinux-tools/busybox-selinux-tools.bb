SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-selinux-tools-1.36.1-27.1.noarch.rpm"
RPM_HASH = "87297830a1dc726f1ebf68285ca26bb285e2941d78df8f4f912a3edc70015a5df2113df74b2161e023804e049288b79bbeefe9a7097aa7aceee4800af0b4e3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
