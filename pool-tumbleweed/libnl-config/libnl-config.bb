SUMMARY = "Name maps for libnl"
DESCRIPTION = "This package contains configuration files for libnl and programs using \
the same; in particular \
- name maps for class-ids -- class-names (like /etc/services) \
- aliases for locations within a packet (ip6.dst => byte offset)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.8.0"

RPM_NAME = "libnl-config-3.8.0-1.1.noarch.rpm"
RPM_HASH = "e36ca62dfacd02133e15fd7eacbc381b2357ab889dd8367f4c37e60a1778c416f22d361cd8cdfdc0e595f233e499a9dce6702bacfab1bd95f6b18c2d6eaa250f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libnl-config \
libnl-config"

RDEPENDS:${PN} += ""

inherit rpm
