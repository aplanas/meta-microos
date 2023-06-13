SUMMARY = "A (h)top like task monitor for NVIDIA and AMD GPUs"
DESCRIPTION = "Nvtop stands for NVidia TOP, a (h)top like task monitor for AMD, NVIDIA and \
now Intel GPUs. \
 \
It can handle multiple GPUs and print information about them in a htop familiar \
way."
LICENSE = "GPL-3.0+"

PV = "3.0.1+29"

RPM_NAME = "nvtop-3.0.1+29-1.1.aarch64.rpm"
RPM_HASH = "ff01fa4e7c7077bf25d4545508601f694f612aab8606c4812f65aa782ffdb3b510a02e9acfba20954e1154443f18b1349fada2e1a9ebae6db8c18388269a392d"

RPROVIDES:${PN} += "application() \
application(nvtop.desktop) \
metainfo() \
metainfo(nvtop.metainfo.xml) \
nvtop \
nvtop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_240)(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
