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

PV = "4.6.2"

RPM_NAME = "autoyast2-4.6.2-1.1.noarch.rpm"
RPM_HASH = "64c86838aa13cf9987c17a129e8d7ac2510ef0f76d753576d89733f691c67a842e2e62a10a2d06722b3a74fa78d1b38bec9ced0832259ab6833926d21582708f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.AutoYaST.desktop) \
application(org.opensuse.yast.CloneSystem.desktop) \
autoyast2 \
metainfo() \
metainfo(org.opensuse.yast.AutoYaST.metainfo.xml) \
metainfo(org.opensuse.yast.CloneSystem.metainfo.xml) \
yast2-config-autoinst \
yast2-lib-autoinst \
yast2-module-autoinst"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
autoyast2-installation \
fillup \
libxslt \
yast2 \
yast2-core \
yast2-country \
yast2-network \
yast2-ruby-bindings \
yast2-schema \
yast2-security \
yast2-storage-ng \
yast2-transfer \
yast2-xml"

inherit rpm
