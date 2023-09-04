SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create cluster!"
LICENSE = "Apache-2.0"

PV = "0.151.0"

RPM_NAME = "eksctl-0.151.0-1.1.aarch64.rpm"
RPM_HASH = "c66df60dc5a107cf2756c7dae73c4be975cff0a80e088672b5f91e3d6296047d63cad3f495b03768571bbca72e88e52e2bc29d8909d91dead75e605ef1f45e39"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
