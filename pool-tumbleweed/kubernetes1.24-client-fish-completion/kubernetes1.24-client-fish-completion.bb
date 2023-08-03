SUMMARY = "Fish Completion for kubernetes1.24-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.24-client."
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-client-fish-completion-1.24.16-1.1.noarch.rpm"
RPM_HASH = "cd7028d5b91c07804aa67a2613ed152dd7e90aaf485685c97e2fd46f2e1d0d3da752b642c8653102bd2a1925a8f864d9f8290ed373e2ee72a3c304afacc6daae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.24-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.24-client"

inherit rpm
