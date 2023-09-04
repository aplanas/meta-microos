SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-tools-20221124-4.1.aarch64.rpm"
RPM_HASH = "0b797c86ab110fdbab0fc61c67f4e3152519f858acd6de2c10edec2375875dabfc5fe15653710910ed1813d589a750963d8101230f464e0f86439be781dcb062"

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
