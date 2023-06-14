SUMMARY = "Name maps for libnl"
DESCRIPTION = "This package contains configuration files for libnl and programs using \
the same; in particular \
- name maps for class-ids -- class-names (like /etc/services) \
- aliases for locations within a packet (ip6.dst => byte offset)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl-config-3.7.0-1.4.noarch.rpm"
RPM_HASH = "034663818293eae3d5a5baa644a73ea544b9618136174bf656d19b905ae076b02971ceb15f84ae58454adadff230bc460bf7d5eb58e97a7b3aaedf554df3788e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libnl-config \
libnl-config"

RDEPENDS:${PN} += ""

inherit rpm
