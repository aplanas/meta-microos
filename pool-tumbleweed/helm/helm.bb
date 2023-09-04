SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "helm-3.12.3-1.1.aarch64.rpm"
RPM_HASH = "ca2dbe22464fba200fd75e9d624519a24f139ff4f9d8a7b984838dd8c03695f7f08dd97474a355d2d57dcef8bbe96ea74fdfe2565e2c01a30fc149a67409c513"

RPROVIDES:${PN} += "helm"

RDEPENDS:${PN} += ""

inherit rpm
