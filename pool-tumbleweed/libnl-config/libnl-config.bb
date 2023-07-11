SUMMARY = "Name maps for libnl"
DESCRIPTION = "This package contains configuration files for libnl and programs using \
the same; in particular \
- name maps for class-ids -- class-names (like /etc/services) \
- aliases for locations within a packet (ip6.dst => byte offset)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl-config-3.7.0-1.5.noarch.rpm"
RPM_HASH = "ba1a1a3fdbc78b1292d02192ca4ca5578a65d4c78bf66ae581f302033bba9a56326dded590f10e1c5a9a96e68e318170ce08d4c0c600ee38195d8464964bab22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libnl-config \
libnl-config"

RDEPENDS:${PN} += ""

inherit rpm
