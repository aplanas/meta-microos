SUMMARY = "Tools for observing Kubernetes resources in real time, powered by Pulumi"
DESCRIPTION = "What happens when you boot up a Pod? What happens to a Service before it is allocated a public IP address? How often is a Deployment's status changing? \
 \
kubespy is a small tool that makes it easy to observe how Kubernetes resources change in real time, derived from the work we did to make Kubernetes deployments predictable in Pulumi's CLI. Run kubespy at any point in time, and it will watch and report information about a Kubernetes resource continuously until you kill it."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "kubespy-0.6.2-1.2.aarch64.rpm"
RPM_HASH = "4b428f3abb7082ffda38780efbeed5937e3fa11e945d790e6f6e0301c22360e6a51d7d5f8875898858f251cf8bad7afba17478c292daeb6a837dcc0441c117c1"

RPROVIDES:${PN} += "kubespy \
kubespy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
