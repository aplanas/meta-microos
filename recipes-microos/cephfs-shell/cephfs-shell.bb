SUMMARY = "Interactive shell for Ceph file system"
DESCRIPTION = "This package contains an interactive tool that allows accessing a Ceph \
file system without mounting it  by providing a nice pseudo-shell which \
works like an FTP client."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "cephfs-shell-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "97d196937dd4e666e9416e54d8b5fb1187d8551c11f51a4b838363431f452937070a34229b424acf70cb07fc5b98747669e697bc0989db34860c5946a297e0d5"

RPROVIDES:${PN} += "cephfs-shell cephfs-shell(aarch-64) python3.10dist(cephfs-shell) python3dist(cephfs-shell)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python3-cephfs python3-cmd2 python3-colorama"

inherit rpm
