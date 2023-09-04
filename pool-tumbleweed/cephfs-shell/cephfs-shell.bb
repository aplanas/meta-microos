SUMMARY = "Interactive shell for Ceph file system"
DESCRIPTION = "This package contains an interactive tool that allows accessing a Ceph \
file system without mounting it  by providing a nice pseudo-shell which \
works like an FTP client."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-shell-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "5356b842c4912015b9d767c0e9ce18387212fe91c7393c708250e5dffd4d65de0a4338e1d6c83a9fc4daf3e5c32e4c81b790675f74c88a5fd117aac1439c9dc4"

RPROVIDES:${PN} += "cephfs-shell \
python3.11dist-cephfs-shell \
python3dist-cephfs-shell"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-cephfs \
python3-cmd2 \
python3-colorama"

inherit rpm
