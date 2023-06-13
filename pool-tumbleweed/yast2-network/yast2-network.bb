SUMMARY = "YaST2 - Network Configuration"
DESCRIPTION = "This package contains the YaST2 component for network configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.3"

RPM_NAME = "yast2-network-4.6.3-1.1.noarch.rpm"
RPM_HASH = "d35017f63fb248387b92bb60135f9c753e1230ca7121c02a3b09d03b4312db030c28782c7d96494a6ed81108bc8870048dc0e01090d920a99900aaff81b5c1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Host.desktop) \
application(org.opensuse.yast.LAN.desktop) \
application(org.opensuse.yast.Remote.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Host.metainfo.xml) \
metainfo(org.opensuse.yast.LAN.metainfo.xml) \
metainfo(org.opensuse.yast.Remote.metainfo.xml) \
yast2-network \
yast2-network-devel-doc"

RDEPENDS:${PN} += "/bin/rm \
/usr/bin/perl \
augeas-lenses \
hostname \
hwinfo \
rubygem(ruby:3.2.0:cfa) \
sysconfig \
yast2 \
yast2-packager \
yast2-proxy \
yast2-ruby-bindings \
yast2-storage-ng \
yast2-xml"

inherit rpm
