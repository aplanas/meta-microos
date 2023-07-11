SUMMARY = "Utility like top(1) for displaying virtualization stats"
DESCRIPTION = "virt-top is a 'top(1)'-like utility for showing stats of virtualized \
domains.  Many keys and command line options are the same as for \
ordinary 'top'. \
 \
It uses libvirt so it is capable of showing stats across a variety of \
different virtualization systems."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "virt-top-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "6682c6f0b988766e9b3a2991295d9206c731e08e556a7b90bb075ed5fecbe29d75b6f57e1bf3b4421163fc466623094263b245a81e5a75db8535dc136b3fd188"

RPROVIDES:${PN} += "ocamlfind-virt-top \
virt-top"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
