SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create cluster!"
LICENSE = "Apache-2.0"

PV = "0.150.0"

RPM_NAME = "eksctl-0.150.0-1.1.aarch64.rpm"
RPM_HASH = "c722eda5a9982c65a8db5bbc5e88ec3751e779734edf3aadf7edb67388c919a37a3d777fb46a1cb08d4ef5c287507523c2b8b1f85063f2ee5e48d56d4d0f45b0"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
