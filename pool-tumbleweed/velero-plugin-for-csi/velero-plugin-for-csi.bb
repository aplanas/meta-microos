SUMMARY = "Velero plugin for CSI snapshot API"
DESCRIPTION = "Velero plugins for integrating with CSI snapshot API"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "velero-plugin-for-csi-0.2.0-1.7.aarch64.rpm"
RPM_HASH = "3cc13c5740a634e3cbf8b1c338ff83ea71aaf2abc0f24709e2a560922712b844e4a90d256a22726f6b1cad8b057b6efa7e7283eab7c185206953b978b70c4e9c"

RPROVIDES:${PN} += "velero-plugin-for-csi \
velero-plugin-for-csi(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
