SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "istioctl-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "eea7b23559c6db5728b758e7cee82e0a4372830f9b66ef83934b24dff3ef2c4358952cde9c5a4eafcf4906efd5ebc6e1a812dc398f6e224929ef77b41ebc1472"

RPROVIDES:${PN} += "istioctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
