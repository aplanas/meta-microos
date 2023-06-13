SUMMARY = "Virtual PC Simulator"
DESCRIPTION = "The VPCS can simulate up to 9 PCs. You can ping/traceroute them, or ping/traceroute \
the other hosts/routers from the virtual PCs when you study the Cisco routers in \
the Dynamips. VPCS is not the traditional PC, it is just a program running on the \
Linux or Windows, and only few network commands can be used in it. But VPCS can \
give you a big hand when you study the Cisco devices in the Dynamips. VPCS can \
replace the routers or VMware boxes which are used as PCs in the Dynamips network. \
 \
Try VPCS, it can save your CPU/Memory. It is very small. \
 \
Now, VPCS can be run in udp or ether mode. In the udp mode, VPCS sends or receives \
the packets via udp. In the ether mode, via /dev/tap, not support on the Windows."
LICENSE = "BSD-2-Clause"

PV = "0.8.2"

RPM_NAME = "vpcs-0.8.2-1.6.aarch64.rpm"
RPM_HASH = "65165254a0c3c4150ae34d5b6bfa2e538542dc662b8d04647844fd7a88ce64fe437467b524ca97acd416987fd9ff9b96839b67a742b1efcc8be97f43c12be582"

RPROVIDES:${PN} += "vpcs \
vpcs(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
