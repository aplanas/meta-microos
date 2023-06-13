SUMMARY = "Documentation for libnl, a library for working with Netlink sockets"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "GPL-3.0-only"

PV = "3.5.0"

RPM_NAME = "libnl-doc-3.5.0-1.10.noarch.rpm"
RPM_HASH = "dc9c81e48e3069a1031c52c059e757d3615b8576f816df65167b1a3717fbf802689c3d83a14b75c743c56abd94501eef95635f43acdce2019ea90b82cdec5fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnl-doc"

RDEPENDS:${PN} += ""

inherit rpm
