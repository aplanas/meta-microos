SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution that runs entirely within Docker containers. It works on bare-metal and virtualized servers. With RKE, the installation and operation of Kubernetes is both simplified and easily automated, and it’s entirely independent of the operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.4.6"

RPM_NAME = "rke-1.4.6-1.1.aarch64.rpm"
RPM_HASH = "7560604a676e491ec678c6daf576119b73c8fc66dd035ac6250829969896ce1710450a576ba96f1c5f90f6c819e6e30bc03d33dfaa35f6748257782fa080d8ea"

RPROVIDES:${PN} += "rke"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
