SUMMARY = "Configuration of booth"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-geo-cluster-4.6.0-1.1.noarch.rpm"
RPM_HASH = "8f539009812b64b57381a21bb17c08efd8d42fb2bf0144fa510fec877b3a58f3c64075ef80651fc9435dc1c5a2e4ee398982168ea2868473bf4c5872e5fc3d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.GeoCluster.desktop) \
metainfo() \
metainfo(org.opensuse.yast.GeoCluster.metainfo.xml) \
perl(GeoCluster) \
yast2-geo-cluster"
RDEPENDS:${PN} += "/usr/bin/python3 \
autoyast2-installation \
yast2 \
yast2-ruby-bindings"

inherit rpm
