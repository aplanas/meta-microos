SUMMARY = "Warewulf Cluster Provisioning Module initramfs for aarch64 systems"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture.  The \
provision module provides functionality for provisioning, configuring, \
and booting systems. \
 \
This package contains the aarch64-specific initramfs used to build the \
bootstrap for aarch64 systems."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-provision-aarch64-initramfs-3.8.1-7.12.noarch.rpm"
RPM_HASH = "79757027e874f890d40cc8c461fc8d31defaa27290a8c0e3565166bcaced51b5be5842e49b92c56b59b0a274826e5f215b051bfa901d47e8f6b9158daae04973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-provision-aarch64-initramfs"

RDEPENDS:${PN} += "warewulf-provision"

inherit rpm
