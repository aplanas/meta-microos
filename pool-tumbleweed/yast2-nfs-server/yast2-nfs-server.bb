SUMMARY = "YaST2 - NFS Server Configuration"
DESCRIPTION = "The YaST2 component for configuration of an NFS server. NFS stands for \
network file system access. It allows access to files on remote \
machines."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-nfs-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "d37a00db7a6df31f968e10a3e15affdfed974b1c406d3d77c1d9f9cc43096f75266a34fc8f7eb95293060fc1bab3e68fdacd9d89128b7b9be9c59126f183fdbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.NFSServer.desktop) \
metainfo() \
metainfo(org.opensuse.yast.NFSServer.metainfo.xml) \
yast2-nfs-server"

RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-nfs-common \
yast2-ruby-bindings"

inherit rpm
