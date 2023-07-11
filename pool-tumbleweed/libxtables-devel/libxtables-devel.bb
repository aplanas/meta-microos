SUMMARY = "Headers and manpages for iptables"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
 \
Link your extension (iptables plugins) with $(pkg-config xtables \
--libs) and place the plugin in the directory given by $(pkg-config \
xtables --variable=xtlibdir)."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libxtables-devel-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "dfade1fbc873a6415f523453f4573a26f3978ef0df55d9f2d72bdc8d5f8c1d490b6265adebc48158b3786ab96e7937c1f90f280836f7b394096d571afe1a663c"

RPROVIDES:${PN} += "libxtables-devel \
pkgconfig-xtables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtables12"

inherit rpm
