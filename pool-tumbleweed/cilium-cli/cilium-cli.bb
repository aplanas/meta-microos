SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "cilium-cli-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "480135ee43b010746954b75a4780d11ac0de23deb5f50e83471307b1bf0238ded5a3f7fddefc87750b3e1d5a27ba14720b02bab75439d64f47632b0ad2877196"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
