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

RPM_NAME = "warewulf-doc-3.8.1-7.8.noarch.rpm"
RPM_HASH = "95dfca877dd96331cc1a4406632ebd7ba88bd0c8e11ff3493478a1203413948c8010dfac6632cf57caa068db8de42585d7af2d6ced42d209a2317c0c0096c539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-doc"

RDEPENDS:${PN} += ""

inherit rpm
