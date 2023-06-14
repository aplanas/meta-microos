SUMMARY = "Find outdated or deprecated Helm charts running in your cluster"
DESCRIPTION = "Nova scans your cluster for installed Helm charts, then cross-checks them against all known Helm repositories. If it finds an updated version of the chart you're using, or notices your current version is deprecated, it will let you know."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-3.6.5-1.1.aarch64.rpm"
RPM_HASH = "981b257df35785254fb9b2f4225da47b3d0f7a64bdd76d8474fb4acf30de88cd3d6e2dbd320eb2e54d74057eeb2f9b6a41c0ed599c7272ae366d548dfb429894"

RPROVIDES:${PN} += "nova"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
