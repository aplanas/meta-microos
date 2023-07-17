SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-tools-20221124-3.11.aarch64.rpm"
RPM_HASH = "2503ecea28af22916a3c819d84f7aacf838fda2312f0edd8deded3eff592cc0bb7c16d571ce4d2f0aacacfd88f1d1ccaeee3d798d92983e0611f7d8e9cc61fde"

RPROVIDES:${PN} += "libvmdk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfuse.so.2 \
libvmdk.so.1"

inherit rpm
