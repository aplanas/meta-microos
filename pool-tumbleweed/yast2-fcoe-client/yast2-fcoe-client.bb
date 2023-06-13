SUMMARY = "YaST2 - Configuration of Fibre Channel over Ethernet"
DESCRIPTION = "This package contains the YaST2 component for the Fibre Channel over \
Ethernet (FCoE) configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-fcoe-client-4.6.0-1.1.noarch.rpm"
RPM_HASH = "2f2d6a7a1b7a0a6bc45e0f79962b5c0680313e3ca55b2a554db78d5730ad9158e80b3eb2fd7005418c28c1ece9a96579a191d4e5f38cf7d089218ee45c01e74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.FCoEClient.desktop) \
metainfo() \
metainfo(org.opensuse.yast.FCoEClient.metainfo.xml) \
yast2-fcoe-client"

RDEPENDS:${PN} += "fcoe-utils \
yast2 \
yast2-network \
yast2-ruby-bindings"

inherit rpm
