SUMMARY = "SMB plugin for csync"
DESCRIPTION = "This plug-in allows applications using csync to synchronize with a \
Samba or Windows server."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-smb-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "be54ba07ff7a8ed51a61c9115ad3601331daefca1cd3d9636755f252d93b8f50485c66765760ebfdbe9b60b0c38dc840dfdba31556bae0b0dd739ff8c6278c70"

RPROVIDES:${PN} += "libcsync-plugin-smb"

RDEPENDS:${PN} += "libc.so.6 \
libcsync.so.0 \
libcsync0 \
libsmbclient.so.0"

inherit rpm
