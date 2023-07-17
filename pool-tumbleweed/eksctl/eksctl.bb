SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create cluster!"
LICENSE = "Apache-2.0"

PV = "0.148.0"

RPM_NAME = "eksctl-0.148.0-1.1.aarch64.rpm"
RPM_HASH = "7e30f6e0677d6ad732b9e630b25a0f065a3f22372d54212b5a22d66371669e91642805f83c5e4e61a967d5b561a7e50b2fc8b8bc81be49aa39ae94d4ed843243"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
