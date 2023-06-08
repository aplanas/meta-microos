SUMMARY = "YaST2 - Automated Installation"
DESCRIPTION = "This package is intended for management of the control files and the \
AutoYaST2 configurations. This system should only be used by \
experienced system administrators. Warning: AutoYaST2 performs the \
installation without any user intervention, warnings, or confirmations \
(unless specified otherwise in the control file). \
 \
This file contains YaST2-independent files needed to create \
installation sources."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "autoyast2-4.6.1-1.1.noarch.rpm"
RPM_HASH = "d1e43c6ae6b410b9d4c4896684f60e1c3ba9d83c1f51eec3a04b9412d3af3b6abb82e08fc3f6d12f6bbe5975d31f7b176055b3b6891308ff163f8c761fb00cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.AutoYaST.desktop) application(org.opensuse.yast.CloneSystem.desktop) autoyast2 metainfo() metainfo(org.opensuse.yast.AutoYaST.metainfo.xml) metainfo(org.opensuse.yast.CloneSystem.metainfo.xml) yast2-config-autoinst yast2-lib-autoinst yast2-module-autoinst"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch autoyast2-installation fillup libxslt yast2 yast2-core yast2-country yast2-network yast2-ruby-bindings yast2-schema yast2-security yast2-storage-ng yast2-transfer yast2-xml"

inherit rpm
