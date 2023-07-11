SUMMARY = "Kubernetes operator for easier RBAC management"
DESCRIPTION = "RBAC Manager is designed to simplify authorization in Kubernetes. \
This is an operator that supports declarative configuration for RBAC with new custom resources. \
Instead of managing role bindings or service accounts directly, you can specify a desired state and RBAC Manager will make the necessary changes to achieve that state."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-1.4.2-1.5.aarch64.rpm"
RPM_HASH = "6244d5e1b7889432139f360993eea083f326e4431724dce7a0fccd8a4a31d54d5824262a22a465cbb8bdaa105e035102bba910507a534efd4aef8f952101f265"

RPROVIDES:${PN} += "rbac-manager"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
