SUMMARY = "Tools for observing Kubernetes resources in real time, powered by Pulumi"
DESCRIPTION = "What happens when you boot up a Pod? What happens to a Service before it is allocated a public IP address? How often is a Deployment's status changing? \
 \
kubespy is a small tool that makes it easy to observe how Kubernetes resources change in real time, derived from the work we did to make Kubernetes deployments predictable in Pulumi's CLI. Run kubespy at any point in time, and it will watch and report information about a Kubernetes resource continuously until you kill it."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "kubespy-0.6.2-1.3.aarch64.rpm"
RPM_HASH = "00c94d15caed000bb2e0b99ad3983d64f8b5e348ee612f2d933f90444a059180755c8afdb445acbd119a685f8420c7943d396873ea0bdf97590b7ae648fcb29b"

RPROVIDES:${PN} += "kubespy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
