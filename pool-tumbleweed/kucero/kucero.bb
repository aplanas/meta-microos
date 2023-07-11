SUMMARY = "Kubernetes control plane certificate auto rotation"
DESCRIPTION = "A Kubernetes daemonset to perform automatic control plane certificate rotation."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "kucero-1.6.2-1.4.aarch64.rpm"
RPM_HASH = "ca1994ba7177ff1e200430d857c1221cd7182245d20bf03db6d0efc3232bc39cfb23997112879d0c08c0eb4c3d48f1911803a0e12a463855104848e48d0138c9"

RPROVIDES:${PN} += "kucero"

RDEPENDS:${PN} += ""

inherit rpm
