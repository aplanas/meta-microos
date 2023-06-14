SUMMARY = "Headers and manpages for iptables"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
 \
Link your extension (iptables plugins) with $(pkg-config xtables \
--libs) and place the plugin in the directory given by $(pkg-config \
xtables --variable=xtlibdir)."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libxtables-devel-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "28b9f0b7dd35cc060fe470d057c3efdc037074c55e7045a469583a3f37ec4c7ea8dc7a557f4c988c1a52078c16d72dd4794fefb407fbdbf0887034f8eba16d96"

RPROVIDES:${PN} += "libxtables-devel \
pkgconfig-xtables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtables12"

inherit rpm
