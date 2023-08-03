SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-client-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "d5849cdf1471bb1d9030d571fc2116ad23587d299663e4a4ddbd0acae004508ff40b98a3e6fa9a480599bc6c2527c80881daba56eb922fdf51144a64670f5e00"

RPROVIDES:${PN} += "kubernetes-client"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
