SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "ec322b9790beadacf46c58e2304669d48b8d6ebd14b5959981958795c78b8e5c8e672365fc53886a4da74e0537360c03042c9540ddc2e80e154d58d6c696442f"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.22-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
