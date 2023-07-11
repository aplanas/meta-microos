SUMMARY = "Warewulf documentation and install recipes"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This package contains documentation for Warewulf, and installation \
recipes to assist in the deployment of a Warewulf cluster."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-doc-3.8.1-7.7.noarch.rpm"
RPM_HASH = "1298612d29f0763df914ab98e7ce90d98ecb491ab123916b88f3b0dbbf5c1537c01d305e3b9436ff8ed6c40597b71a3d45d80e2c8ce339d40754d199be300780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-doc"

RDEPENDS:${PN} += ""

inherit rpm
