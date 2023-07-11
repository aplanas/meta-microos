SUMMARY = "Orchestrator for distributed storage systems in cloud-native environments"
DESCRIPTION = "Rook is a cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
See https://github.com/rook/rook for more information."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-1.6.2+git0.ge8fd65f08-2.9.aarch64.rpm"
RPM_HASH = "3f58c32ad7d6b8c206146ab582503421b9a023045bb5bc209550606897006fbfb585a0104c75ab64a8845dffd7e0f0e758eed3986f4ac7e66f86efb49835ba35"

RPROVIDES:${PN} += "config-rook \
rook"

RDEPENDS:${PN} += "/usr/bin/sh \
pattern- \
tini"

inherit rpm
