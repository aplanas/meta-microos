SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution that runs entirely within Docker containers. It works on bare-metal and virtualized servers. With RKE, the installation and operation of Kubernetes is both simplified and easily automated, and it’s entirely independent of the operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.4.8"

RPM_NAME = "rke-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "3b490b7fc62922db8016bcaa31b1830c0e4156fd6f66c8bd53ef6f4816c637991381820cc8fbcc97300d176b71a5579763754df47669da7cc323dcf028d57068"

RPROVIDES:${PN} += "rke"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
