SUMMARY = "Main Warewulf daemon and utilities"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This is the main package which includes the command line interface, \
initialization script, and configuration definition. All other warewulf \
modules depend on this module for configuration information."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-common-3.8.1-7.6.noarch.rpm"
RPM_HASH = "66bb4fbe08ac9787e1e485801edebdff0a2383eaa8d9681ec655a1474d2cb25a68358b3934dc4bed432d3575338b3191a5ea36069e89bfbbc908dc7378962ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-common"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
mysql \
perl-warewulf-common \
shadow \
warewulf-doc"

inherit rpm
