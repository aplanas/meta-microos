SUMMARY = "Virtual Distributed Ethernet"
DESCRIPTION = "VDE is a virtual network that can be spawned over a set of physical \
computer over the Internet \
 \
VDE connects together: \
  (1) real GNU-linux boxes (tuntap) \
  (2) virtual machines: UML-User Mode Linux, qemu, bochs, MPS. \
 \
VDE can be used: \
  (i) to create a general purpose tunnel (every protocol that runs \
    on a Ethernet can be put into the tunnel) \
  (ii) to connect a set of virtual machine to the Internet with no \
    need of free access of tuntap \
  (iii) to support mobility: a VDE can stay interconnected despite \
    of the change of virtual cables, i.e. the change of IP addresses \
    and interface in the real world"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "vde2-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "a637c7795ea0954d028e4017572195b01644c0113e4745f8fc66c64ec05a0a0c774e6baee253e7847b07d43b7996dcaf2de590b5732639e6a24395c50ad0710f"

RPROVIDES:${PN} += "config(vde2) \
libvdetap.so()(64bit) \
vde2 \
vde2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcap.so.1()(64bit) \
libvdehist.so.0()(64bit) \
libvdemgmt.so.0()(64bit) \
libvdeplug.so.3()(64bit)"

inherit rpm