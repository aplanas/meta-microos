SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create cluster!"
LICENSE = "Apache-2.0"

PV = "0.156.0"

RPM_NAME = "eksctl-0.156.0-1.1.aarch64.rpm"
RPM_HASH = "25d2fe01cbcc57685b77acfca538604b509b973de36339ab7b0b3b1cc5908ac5e82e38c2674c46bfd6a7f77c50d83fa820f9f35c12c7b005e9bc6e231ba12f0a"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
