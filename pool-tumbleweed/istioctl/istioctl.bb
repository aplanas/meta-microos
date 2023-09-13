SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "istioctl-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "a86a4497f4f41ac1ce7d335d0b2d0f34e380cff94280774cbc3d1307002f48274b66efd6a105707d42dacc98a915dff6df38f11928a9b0a6b6c95013b38c8886"

RPROVIDES:${PN} += "istioctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
