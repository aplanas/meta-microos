SUMMARY = "YaST2 - Sudo configuration"
DESCRIPTION = "The YaST2 component for sudo configuration. It configures capabilities \
of users to run commands as root or other user."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-sudo-4.6.1-1.1.noarch.rpm"
RPM_HASH = "27db85d82977ecb9e831a696cb82e2829582bb40caa0c512a4ec68fb32832b7cffa34e0a4c3d3580eec08d72d0445613d8caf357151f8b58f22a6cd0b5d44e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Sudo.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Sudo.metainfo.xml) \
yast2-sudo"

RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-ruby-bindings \
yast2-users"

inherit rpm
