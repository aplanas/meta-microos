SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-tools-20221124-3.7.aarch64.rpm"
RPM_HASH = "ee4e206fec6c0afb4457f33016425814d017dbb806bb25a4a683a8a1bb523f597fb9bb4ff04f8bf88531107fb73193147165991a91d8e12f73156679d0359368"

RPROVIDES:${PN} += "libvmdk-tools \
libvmdk-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libvmdk.so.1()(64bit) \
libvmdk.so.1(V_20221124)(64bit)"

inherit rpm
