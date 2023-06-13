SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution that runs entirely within Docker containers. It works on bare-metal and virtualized servers. With RKE, the installation and operation of Kubernetes is both simplified and easily automated, and it’s entirely independent of the operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "rke-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "c1fa9a0c8379fc878cf35b53d3c3371b2cb49adb4dee2ce7d1c61f1b69fc2d01d328e29ce2b6e5c677f41b4fe33609da6ecec9004aef31d866e7006fafd2db4c"

RPROVIDES:${PN} += "rke \
rke(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
