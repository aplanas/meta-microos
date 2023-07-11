SUMMARY = "Validate your Kubernetes configuration files"
DESCRIPTION = "kubeval is a tool for validating a Kubernetes YAML or JSON configuration file. It does so using schemas generated from the Kubernetes OpenAPI specification, and therefore can validate schemas for multiple versions of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "kubeval-0.16.1-1.10.aarch64.rpm"
RPM_HASH = "05db7627ca72ffd48281190141c0f5d930d307c5eb7f530a2abeba5f09a923d9faa70612c9191aeee90d0c5acd272f554f8cb40e9c19a001a3c83bc2cd6c2fd4"

RPROVIDES:${PN} += "kubeval"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
