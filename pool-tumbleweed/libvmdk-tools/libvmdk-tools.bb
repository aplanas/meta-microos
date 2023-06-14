SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-tools-20221124-3.7.aarch64.rpm"
RPM_HASH = "ee4e206fec6c0afb4457f33016425814d017dbb806bb25a4a683a8a1bb523f597fb9bb4ff04f8bf88531107fb73193147165991a91d8e12f73156679d0359368"

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
