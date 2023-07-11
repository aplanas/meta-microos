SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.12.1"

RPM_NAME = "helm-3.12.1-1.1.aarch64.rpm"
RPM_HASH = "936e594e5d0eaffb2c117f37556d2845893eda651a779ba441f5acb232536fd6fa41bfb1cd34b74c7daa4ae27485974ea19a951d002ecebb9e4e1c98f5c98eee"

RPROVIDES:${PN} += "helm"

RDEPENDS:${PN} += ""

inherit rpm
