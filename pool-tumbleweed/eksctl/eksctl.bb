SUMMARY = "The official CLI for Amazon EKS"
DESCRIPTION = "eksctl is a simple CLI tool for creating clusters on EKS - Amazon's new managed Kubernetes service for EC2. It is written in Go, and uses CloudFormation. \
 \
You can create a cluster in minutes with just one command – eksctl create cluster!"
LICENSE = "Apache-2.0"

PV = "0.149.0"

RPM_NAME = "eksctl-0.149.0-1.1.aarch64.rpm"
RPM_HASH = "4ff0d22d74898636d0b2a9afd92c0dfb9113e121694e9b3d8e95dee0439829def29362a0a8b9100ef661ba3002979774d505d36aa0d21509b2a0ba4431bdd90a"

RPROVIDES:${PN} += "eksctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
