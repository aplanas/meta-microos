SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution that runs entirely within Docker containers. It works on bare-metal and virtualized servers. With RKE, the installation and operation of Kubernetes is both simplified and easily automated, and it’s entirely independent of the operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.4.7"

RPM_NAME = "rke-1.4.7-1.1.aarch64.rpm"
RPM_HASH = "4d5c89a30abfa97e55c5c1ec66a380c0e4db919bd0960f72b3522c932d34f12cc86dc43c359ac625031db7b345f680ec12e824dc10fcca421d15df55445320a4"

RPROVIDES:${PN} += "rke"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
