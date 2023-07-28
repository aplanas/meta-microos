SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.18.1"

RPM_NAME = "istioctl-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "58ace23081f2c45c4caf80bc868c9fda23633b56a75b9d7e00234861eb2cf84a59f81f7f841dd4c8b1c4f9b960a61d03b7559ae3635d92cafc38e1dd61f2c981"

RPROVIDES:${PN} += "istioctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
