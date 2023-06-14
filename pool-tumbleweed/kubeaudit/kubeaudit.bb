SUMMARY = "Audit your Kubernetes clusters against common security controls"
DESCRIPTION = "kubeaudit is a command line tool and a Go package to audit Kubernetes clusters for various different security concerns, such as: \
 \
- run as non-root \
- use a read-only root filesystem \
- drop scary capabilities, don't add new ones \
- don't run privileged \
- and more! \
 \
kubeaudit makes sure you deploy secure containers!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-0.22.0-1.2.aarch64.rpm"
RPM_HASH = "f396ea9e23c7f11e1d1492e83dab0f8ef635653037ccc4e66cf75d4a1724231306b47d9797ad8e34b55f284193ea746d6b5c4765ce6236d611ed70b491cc6825"

RPROVIDES:${PN} += "kubeaudit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
