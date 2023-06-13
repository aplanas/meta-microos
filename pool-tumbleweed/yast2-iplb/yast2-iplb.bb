SUMMARY = "Configuration of iplb"
DESCRIPTION = "YaST2 - Configuration of IP load balance.With this module \
you can configure a IP load balance system, frequently \
used on high availability (HA) clusters."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-iplb-4.6.0-1.1.noarch.rpm"
RPM_HASH = "8c7a9bc50739e63e65208a75f75c5a5f16f9b96f77aeb02e6982d92a36750471919c74d78fc1fa9505860f07e70339bc29346ab617bfdd321281df151f16a52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.IPLB.desktop) \
metainfo() \
metainfo(org.opensuse.yast.IPLB.metainfo.xml) \
yast2-iplb"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
