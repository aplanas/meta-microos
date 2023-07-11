SUMMARY = "Interactive shell for Ceph file system"
DESCRIPTION = "This package contains an interactive tool that allows accessing a Ceph \
file system without mounting it  by providing a nice pseudo-shell which \
works like an FTP client."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-shell-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "7ddab129f7e3e499c774cbb3b3adf101404fce1170acd683c6ed03ca4f4efdb9796b40f7292841d457ea737d866b852e6b4650eefb3f3d450d17ae4472132ac6"

RPROVIDES:${PN} += "cephfs-shell \
python3.11dist-cephfs-shell \
python3dist-cephfs-shell"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-cephfs \
python3-cmd2 \
python3-colorama"

inherit rpm
