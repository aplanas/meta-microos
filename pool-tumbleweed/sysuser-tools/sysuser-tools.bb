SUMMARY = "Auto provides for system users"
DESCRIPTION = "Generate auto provides for system users."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "sysuser-tools-3.2-1.1.noarch.rpm"
RPM_HASH = "f8fc13f1b0ee275fafa8b7770b396551e2ef96ba8220bf4509a894dfca324a27921d4a48b7ce87941ae8b5527b556e6761ce528b70cfaaaa68ad8d496a07c54f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-sysusers-generate-pre \
rpm-macro-sysusers-requires \
sysuser-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
sysuser-shadow"

inherit rpm
