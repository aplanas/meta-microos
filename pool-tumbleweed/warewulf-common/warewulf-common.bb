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

RPM_NAME = "warewulf-common-3.8.1-7.7.noarch.rpm"
RPM_HASH = "cd433411a198565f348b87ac8499993b12459c298acaae968aa04749feae989a8533d311d0df31944e0f18cd294850f9154e2deee4eea1df8d8cc22ee19d5c1f"
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
