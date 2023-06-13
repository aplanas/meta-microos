SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "a5893981aa9b22d7c9b9ec0e0937701bfb38edc1d3692e4da6c8d397d6314e4744408ea596cf795a1e2c7203a05a2db4f317999a0756e313e25492d5472a5e74"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.23-client \
kubernetes1.23-client(aarch-64)"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
