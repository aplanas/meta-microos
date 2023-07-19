SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.12.2"

RPM_NAME = "helm-3.12.2-1.1.aarch64.rpm"
RPM_HASH = "90c982f73c464910fc1e34ef51278990431a9c95eac5f7e13e769071dc9fe7fd007d7dec9aa834e6835e91799595c41ff37e44d5e6dfdeab7e175ad3443c9e5d"

RPROVIDES:${PN} += "helm"

RDEPENDS:${PN} += ""

inherit rpm
