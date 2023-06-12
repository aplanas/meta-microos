SUMMARY = "Interactive shell for Ceph file system"
DESCRIPTION = "This package contains an interactive tool that allows accessing a Ceph \
file system without mounting it  by providing a nice pseudo-shell which \
works like an FTP client."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-shell-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "f89d176ca7b3f7ab3fc8b308ec3181b28ddce0a18668d91b513318e32ce55d4f873e8ee8f5830f6466fc6a4cb2cc12cedbed6bbf563050091e544bd6692254b3"

RPROVIDES:${PN} += "cephfs-shell cephfs-shell(aarch-64) python3.10dist(cephfs-shell) python3dist(cephfs-shell)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python3-cephfs python3-cmd2 python3-colorama"

inherit rpm
