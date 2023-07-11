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

RPM_NAME = "vde2-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "6f95a15977cf5974189d70d8302695e55c65a7a0f16a18485ee961b7f8fb801ac75e516818f2bb6a65f0e8dd1e4df5979897ebc9b0954577ad78a3470d1ccceb"

RPROVIDES:${PN} += "config-vde2 \
libvdetap.so \
vde2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1 \
libvdehist.so.0 \
libvdemgmt.so.0 \
libvdeplug.so.3"

inherit rpm
