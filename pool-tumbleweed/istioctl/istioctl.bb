SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-1.17.2-2.2.aarch64.rpm"
RPM_HASH = "9384958fda88e5313c4b42cf0d3219a9e690867dd93a514bae18d8c870bea51b0f957d4d6f3c7557e02c910039a84c87c0383649e022af47e610a84438737a3d"

RPROVIDES:${PN} += "istioctl \
istioctl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
