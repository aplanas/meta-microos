SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "istioctl-1.18.2-1.1.aarch64.rpm"
RPM_HASH = "03d4f592ce78343f6edbf972c8b860e81932cb742784c9bcb73c9b2eda270fb42ad7d3a25bd24d3ee1da7a4b4ea609d5c9955555a616a43c6a67124020d27ad0"

RPROVIDES:${PN} += "istioctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
