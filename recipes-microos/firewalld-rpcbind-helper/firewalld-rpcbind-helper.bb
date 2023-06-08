SUMMARY = "Tool for static port assignment of NFSv3, ypserv, ypbind services"
DESCRIPTION = "This is a helper utility for the configuration of static NFSv3, ypserv and \
ypbind network ports for use with firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "0.21"

RPM_NAME = "firewalld-rpcbind-helper-0.21-1.10.noarch.rpm"
RPM_HASH = "94e29a4670d465bf970b1843c877f08954e16212e6e3396d089b92701d261379dc4ff96e0614b5fcc5f7faf288573841544acf91337e90d9cd5112635dbf0b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-rpcbind-helper"
RDEPENDS:${PN} += "/usr/bin/python3 python3"

inherit rpm
