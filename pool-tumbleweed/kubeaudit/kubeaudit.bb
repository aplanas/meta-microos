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

RPM_NAME = "kubeaudit-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "2e402e13452c243a8255fa7e4f6669a585ace4fec68846cb131ca6440d8f2781bcec6dcfd79c915af95566df48b02a4794b8562eb1eec3b6ff17937216c25f07"

RPROVIDES:${PN} += "kubeaudit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
