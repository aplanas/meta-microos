SUMMARY = "A top-like tool for your Kubernetes clusters"
DESCRIPTION = "A top-like tool for your Kubernetes cluster. \
 \
Following the tradition of Unix/Linux top tools, ktop is a tool that displays useful metrics information about nodes, pods, and other workload resources running in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "ktop-0.3.5-1.3.aarch64.rpm"
RPM_HASH = "35e23cf9c5f6aa907bd7aced19c7edcd08ba554648dac67f3d63e1f803a66f0dbd23b608183cdfe8afad1e5aafa0677968008497b34a21ffc840aade7bd0e688"

RPROVIDES:${PN} += "ktop"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
