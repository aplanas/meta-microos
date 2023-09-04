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

RPM_NAME = "warewulf-common-3.8.1-7.8.noarch.rpm"
RPM_HASH = "78977cd3face512c091022ab68636439854d51988dffc8c7601dda2fa81441d8ac421856363a72b49ee3602b484a482621c0eb59e750b1634f51cdca0ff56919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
mysql \
perl-warewulf-common \
shadow \
warewulf-doc"

inherit rpm
